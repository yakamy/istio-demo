package com.yakamy.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author chenjunwei
 * @date 2020-08-27 16:56
 * @description
 */
@EnableFeignClients(basePackages = "com.yakamy.remote")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
