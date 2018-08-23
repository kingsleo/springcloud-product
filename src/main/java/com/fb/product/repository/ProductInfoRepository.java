package com.fb.product.repository;

import com.fb.product.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * java类简单作用描述
 *
 * @ProjectName: product
 * @Package: com.fb.product.repository
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/14 下午2:58
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public interface ProductInfoRepository extends JpaRepository<ProductInfo, Long> {

    List<ProductInfo> findByProductStatus(Integer productStatus);

    List<ProductInfo> findByProductIdIn(List<Long> productIdList);
}
