package com.kyrie.product.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

/**
 * @ClassName ActivemqConfig
 * @Description
 * @Author tengxiao.ma
 * @Date 2019/10/21 14:56
 **/
@Component
public class ActivemqConfig {

    @Value(value = "${queue}")
    private String queue;

    @Bean
    public Queue getQueue() {
        return  new ActiveMQQueue(queue);
    }
}
