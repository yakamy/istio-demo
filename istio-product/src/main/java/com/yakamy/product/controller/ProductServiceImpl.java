package com.yakamy.product.controller;

import com.yakamy.remote.product.ProductService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenjunwei
 * @date 2020-08-27 16:21
 * @description
 */
@RestController
public class ProductServiceImpl implements ProductService {

    @Value("${spring.version:1.0}")
    private String version;

    @Override
    public String getProductList() {
        return "product list" + version;
    }
}
