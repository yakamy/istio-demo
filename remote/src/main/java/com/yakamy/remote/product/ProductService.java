package com.yakamy.remote.product;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenjunwei
 * @date 2020-09-01 10:02
 * @description
 */
@FeignClient(value = "${product.name:product}", url = "${product.url:product}")
public interface ProductService {

    /**
     * 查询产品列表
     *
     * @return {@link String}
     * @author junwei.chen
     * @date 2020/9/1 10:04
     */
    @RequestMapping("/list")
    String getProductList();

}
