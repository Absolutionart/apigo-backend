package com.jerry.apigo.service;

import com.apigo.apigocommon.model.entity.UserInterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;


/**
* @author 71953
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-07-08 00:18:49
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    boolean invokeCount(long interfaceInfoId, long userId);
}
