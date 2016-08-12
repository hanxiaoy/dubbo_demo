package org.dubbo.service.impl;

import org.dubbo.service.TestService;

/**
 * Created by hanxy on 2016/8/12.
 * projectName : dubbo
 * description :
 */
public class TestServiceImpl implements TestService {

    public void say(){
        System.out.println("say  hello dubbo");
    }
}
