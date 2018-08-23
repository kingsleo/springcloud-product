package com.fb.product.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * java类简单作用描述
 *
 * @ProjectName: product
 * @Package: com.fb.product.VO
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/15 上午9:47
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@Data
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    List<ProductIntoVO> productIntoVOList;
}
