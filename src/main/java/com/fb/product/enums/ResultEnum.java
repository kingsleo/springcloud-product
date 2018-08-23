package com.fb.product.enums;

import lombok.Getter;

/**
 * java类简单作用描述
 *
 * @ProjectName: eureka
 * @Package: com.fb.product.enums
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/22 下午2:29
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(1, "商品不存在"),
    PRODUCT_ERROR_STOCK(2, "库存不足"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
