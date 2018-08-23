package com.fb.product.exception;

import com.fb.product.VO.ProductIntoVO;
import com.fb.product.enums.ResultEnum;

/**
 * java类简单作用描述
 *
 * @ProjectName: eureka
 * @Package: com.fb.product.exception
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/22 下午2:23
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class ProdcutException extends RuntimeException {

    private Integer code;

    public ProdcutException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProdcutException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
