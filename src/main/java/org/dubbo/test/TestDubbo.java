package org.dubbo.test;

import com.alibaba.dubbo.config.annotation.Reference;
import org.dubbo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hanxy on 2016/8/15.
 * projectName : dubbo
 * description :
 */
@Controller
@RequestMapping("/testContr")
public class TestDubbo {

    @Autowired
    @Reference(version="1.0.0")
    private static TestService demoService;


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        TestService demoService = (TestService)context.getBean("demoService"); // 获取远程服务代理
        System.out.println("start");
        String s = demoService.say("dubbo"); // 执行远程方法
        System.out.println(s);
    }

    @RequestMapping("/test")
    public String test(){
        String s = demoService.say("dubbo"); // 执行远程方法
        System.out.println(s);
        System.out.println("test()");
        return  "";
    }
}
