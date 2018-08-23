package com.fb.product.service.impl;

import com.fb.product.ProductApplicationTests;
import com.fb.product.dataobject.ProductInfo;
import com.fb.product.dto.CartDTO;
import com.fb.product.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * java类简单作用描述
 *
 * @ProjectName: product
 * @Package: com.fb.product.service.impl
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/14 下午8:55
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@Component
public class ProductServiceImplTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void findByUpAll() throws Exception {
        List<ProductInfo> list = productService.findByUpAll();
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void findByProductIdList() throws Exception {
        List<ProductInfo> list = productService.findByProductId(Arrays.asList(1L, 2L));
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void decreaseStock() {
        CartDTO cartDTO = new CartDTO(1L, 1);
        productService.decreaseStock(Arrays.asList(cartDTO));
    }

}