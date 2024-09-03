package com.jerry.apigo.mapper;

import com.apigo.apigocommon.model.entity.UserInterfaceInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jerry.apigo.model.vo.InterfaceInvokeInfoVO;

import java.util.List;

/**
* @author 71953
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2024-07-08 00:18:48
* @Entity generator.domain.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<InterfaceInvokeInfoVO> listTopInvokeInterfaceInfo(int limit);
}




