package org.dubbo.test;

import org.dubbo.service.TestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hanxy on 2016/8/15.
 * projectName : dubbo
 * description :
 */
public class TestDubbo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        TestService demoService = (TestService)context.getBean("demoService"); // ��ȡԶ�̷������
        System.out.println("start");
        demoService.say(); // ִ��Զ�̷���
    }
}
