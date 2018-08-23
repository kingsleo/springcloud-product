package com.fb.product.VO;

import lombok.Data;

/**
 * java类简单作用描述
 *
 * @ProjectName: product
 * @Package: com.fb.product.VO
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/15 上午9:42
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
