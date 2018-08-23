package com.fb.product.service.impl;

import com.fb.product.ProductApplicationTests;
import com.fb.product.dataobject.ProductCategory;
import com.fb.product.repository.ProductCategoryRepository;
import com.fb.product.service.CategoryService;
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
 * @CreateDate: 2018/8/15 上午9:24
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@Component
public class CategoryServiceImplTest extends ProductApplicationTests {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(1, 2));
        Assert.assertTrue(list.size() > 0);

    }

}