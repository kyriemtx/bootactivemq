package com.kyrie.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @ClassName com.kyrie.product.ProducterApplication
 * @Description
 * @Author tengxiao.ma
 * @Date 2019/10/21 15:23
 **/
@SpringBootApplication
@EnableScheduling
public class ProducterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducterApplication.class);
    }
}
