package com.yakamy.remote.store;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenjunwei
 * @date 2020-09-01 10:38
 * @description
 */
@FeignClient(value = "${store.name:store}", url = "${store.url:store}")
public interface StoreService {
    /**
     * 查询商店列表
     *
     * @return {@link String}
     * @author junwei.chen
     * @date 2020/9/1 10:04
     */
    @RequestMapping("/list")
    String getStoreList();
}
