package com.kyrie.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kyrie.product.setvice.ProuductService;

import java.time.Instant;


/**
 * @ClassName ActivemqController
 * @Description
 * @Author tengxiao.ma
 * @Date 2019/10/21 15:09
 **/
@RestController
public class ActivemqController {

    @Autowired
    private ProuductService prouduct;


    @GetMapping("/send")
    public void sendQueue(String msg){
        System.out.println(Instant.now().toString());
        prouduct.sendQueue(msg);
    }
}
