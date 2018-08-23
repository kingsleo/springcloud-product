package com.fb.product.controller;

import com.fb.product.VO.ProductIntoVO;
import com.fb.product.VO.ProductVO;
import com.fb.product.VO.ResultVO;
import com.fb.product.dataobject.ProductCategory;
import com.fb.product.dataobject.ProductInfo;
import com.fb.product.dto.CartDTO;
import com.fb.product.service.CategoryService;
import com.fb.product.service.ProductService;
import com.fb.product.util.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * java类简单作用描述
 *
 * @ProjectName: product
 * @Package: com.fb.product.controller
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/14 上午11:45
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO<ProductIntoVO> list() {
        // 查下所有在架的商品
        List<ProductInfo> productInfoList = productService.findByUpAll();

        // 获取类目type列表
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(ProductInfo::getCategoryType)
                .collect(Collectors.toList());

        // 从数据库查询类目
        List<ProductCategory> categoryList = categoryService.findByCategoryTypeIn(categoryTypeList);

        // 构造数据
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory : categoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());

            List<ProductIntoVO> productIntoVOList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryId())) {
                    ProductIntoVO productIntoVO = new ProductIntoVO();
                    BeanUtils.copyProperties(productInfo, productIntoVO);
                    productIntoVOList.add(productIntoVO);
                }
            }
            productVO.setProductIntoVOList(productIntoVOList);
            productVOList.add(productVO);
        }
        return ResultVOUtil.success(productVOList);
    }

    /**
     * 获取商品列表(给订单服务用的)
     * @return
     */
    @PostMapping("/listForOrder")
    public List<ProductInfo> listForOrder(@RequestBody List<Long> productIdList) {
        return productService.findByProductId(productIdList);
    }

    /**
     * 扣除库存
     */
    @PostMapping("/decreaseStock")
    public String decreaseStock(@RequestBody List<CartDTO> cartDTOList) {
        productService.decreaseStock(cartDTOList);
        return "ok";
    }

}
