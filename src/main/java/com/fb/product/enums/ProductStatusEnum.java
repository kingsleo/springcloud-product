package com.fb.product.enums;

import lombok.Getter;

/**
 * 商品上下架状态
 *
 * @ProjectName: product
 * @Package: com.fb.product.enums
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/14 下午8:49
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架"),
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
