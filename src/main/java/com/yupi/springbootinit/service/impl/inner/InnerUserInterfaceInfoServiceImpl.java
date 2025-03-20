package com.yupi.springbootinit.service.impl.inner;

import com.yupi.dubbocommon.model.entity.UserInterfaceInfo;
import com.yupi.dubbocommon.service.InnerUserInterfaceInfoService;
import com.yupi.springbootinit.service.UserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author lintai
 * @version 1.0
 */
@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Override
    public boolean invokeCount(long userId, long interfaceInfoId) {
        return userInterfaceInfoService.invokeCount(userId, interfaceInfoId);
    }
}
