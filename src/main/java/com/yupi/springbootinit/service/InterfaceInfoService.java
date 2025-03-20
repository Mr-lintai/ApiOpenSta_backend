package com.yupi.springbootinit.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.dubbocommon.model.entity.InterfaceInfo;

/**
* @author lintai
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-12-30 14:17:47
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    /**
     * 校验
     *
     * @param interfaceInfo
     * @param add
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
