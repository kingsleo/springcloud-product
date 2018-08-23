package com.fb.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * java类简单作用描述
 *
 * @ProjectName: product
 * @Package: com.fb.product.controller
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/17 下午3:54
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@RestController
@RequestMapping("/service")
public class ServiceController {

    @GetMapping("/msg")
    public String message() {
        return "This is a service";
    }
}
