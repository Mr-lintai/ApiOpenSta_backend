package com.yupi.springbootinit.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.dubbocommon.model.entity.UserInterfaceInfo;

/**
* @author lintai
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2025-01-17 22:45:07
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userinterfaceInfo, boolean add);

    boolean invokeCount(long userId, long interfaceInfoId);
}
