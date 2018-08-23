package com.fb.product.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * java类简单作用描述
 *
 * @ProjectName: product
 * @Package: com.fb.product.VO
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/15 上午9:51
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@Data
public class ProductIntoVO {

    @JsonProperty("id")
    private Integer productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;


}
