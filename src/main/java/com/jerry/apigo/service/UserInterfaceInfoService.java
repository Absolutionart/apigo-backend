package com.jerry.apigo.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.jerry.apigo.model.entity.UserInterfaceInfo;

/**
* @author 71953
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-07-08 00:18:49
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    boolean invokeCount(long interfaceInfoId, long userId);
}
