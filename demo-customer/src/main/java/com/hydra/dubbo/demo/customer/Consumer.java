package com.hydra.dubbo.demo.customer;

import com.hydra.dubbo.demo.api.Login;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yahto on 26/12/2017
 */
public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        Login demoService = context.getBean(Login.class);
        System.out.println("consumer");
        if (demoService.isLogin("wang", "shenghu")){
            System.out.println("-----YES-----");
        }else{
            System.out.println("-----NO-----");
        }
    }
}
