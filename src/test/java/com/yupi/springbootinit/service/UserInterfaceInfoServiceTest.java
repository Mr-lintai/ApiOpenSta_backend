package com.yupi.springbootinit.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import javax.annotation.Resource;


/**
 * @author lintai
 * @version 1.0
 */
@SpringBootTest
public class UserInterfaceInfoServiceTest {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Test
    public void invokeCount() {
        boolean b = userInterfaceInfoService.invokeCount(7, 1873578114483212291L);
        Assertions.assertTrue(b);
    }

//    @Test
//    void testInvokeCount() {
//    }
}