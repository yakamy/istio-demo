package com.yakamy.store.controller;

import com.yakamy.remote.product.ProductService;
import com.yakamy.remote.store.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenjunwei
 * @date 2020-08-27 16:57
 * @description
 */
@RestController
public class StoreServiceImpl implements StoreService {

    @Autowired
    private ProductService productService;

    @Override
    public String getStoreList() {
        return productService.getProductList();
    }
}
