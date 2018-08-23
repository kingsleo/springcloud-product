package com.fb.product.service;

import com.fb.product.dataobject.ProductInfo;
import com.fb.product.dto.CartDTO;

import java.util.List;

/**
 * java类简单作用描述
 *
 * @ProjectName: product
 * @Package: com.fb.product.service
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/14 下午8:37
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findByUpAll();

    /**
     * 获取商品列表(给订单服务用的)
     */
    List<ProductInfo> findByProductId(List<Long> productIdList);

    /**
     * 扣除库存
     */
    void decreaseStock(List<CartDTO> cartDTOList);



}
