package com.kyrie.recive.listener;

import com.kyrie.recive.entity.User;
import com.kyrie.recive.service.UserSerive;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @ClassName MyListener
 * @Description   监听器
 * @Author tengxiao.ma
 * @Date 2019/10/21 15:36
 **/

@Slf4j
@Component
public class MyListener implements MessageListener {

    @Autowired
    private UserSerive userSerive;

    @JmsListener(destination = "${queue}")
    @Override
    public void onMessage(Message message) {
        log.info("-----------消息接收器监听器----------");
        TextMessage textMessage = (TextMessage) message;
        try {
            String text = textMessage.getText();
            log.info("监听器接受到的消息为："+text);
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }



}
