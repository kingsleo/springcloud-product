package com.fb.product.util;

import com.fb.product.VO.ResultVO;

/**
 * java类简单作用描述
 *
 * @ProjectName: product
 * @Package: com.fb.product.util
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/15 上午11:11
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setData(object);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
