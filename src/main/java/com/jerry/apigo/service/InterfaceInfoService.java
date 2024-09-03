package com.jerry.apigo.service;

import com.apigo.apigocommon.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 71953
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-07-04 21:56:14
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean b);
}
