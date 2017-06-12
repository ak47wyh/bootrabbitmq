package com.example.demo.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/6/12.
 */
@Component
public class Receiver {

    @RabbitListener(queues = "myRabbitMq")
    public void receiverMessage(String message){
        System.out.println("received raabitmq:"+message);
    }
}
