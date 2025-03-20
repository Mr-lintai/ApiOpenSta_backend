package com.yupi.springbootinit.provider;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author lintai
 * @version 1.0
 */
@DubboService
public class DemoServiceimpl implements  DemoService{


    @Override
    public String sayHello(String name) {
        return "Hello" + name;
    }

    @Override
    public String sayHello2(String name) {
        return "yupi" + name;
    }
}
