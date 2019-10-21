package com.kyrie.product.setvice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Queue;

/**
 * @ClassName ProuductService
 * @Description
 * @Author tengxiao.ma
 * @Date 2019/10/21 14:51
 **/
@Service
public class ProuductService {

   @Autowired
   private JmsMessagingTemplate jmsMessagingTemplate;

   @Value("${queue}")
   private String queueName;

   public void sendQueue(String msg){
       jmsMessagingTemplate.convertAndSend(queueName,msg);

   }

}
