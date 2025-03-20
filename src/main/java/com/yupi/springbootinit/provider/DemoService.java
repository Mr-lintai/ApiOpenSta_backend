package com.yupi.springbootinit.provider;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author lintai
 * @version 1.0
 */
public interface DemoService{

    public String sayHello(String name);

    public String sayHello2(String name);
}
