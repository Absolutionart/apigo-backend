package com.jerry.apigo.service.impl;

import com.apigo.apigocommon.model.entity.UserInterfaceInfo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jerry.apigo.common.ErrorCode;
import com.jerry.apigo.exception.BusinessException;
import com.jerry.apigo.exception.ThrowUtils;
import com.jerry.apigo.mapper.UserInterfaceInfoMapper;
import com.jerry.apigo.service.UserInterfaceInfoService;
import org.springframework.stereotype.Service;

/**
* @author 71953
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service实现
* @createDate 2024-07-08 00:18:49
*/
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
    implements UserInterfaceInfoService {

    @Override
    public void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add) {
        if (userInterfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 创建时，所有参数必须非空
        if (add) {
            ThrowUtils.throwIf(userInterfaceInfo.getUserId() <= 0 || userInterfaceInfo.getInterfaceInfoId() <= 0,
                    ErrorCode.PARAMS_ERROR, "用户或接口不存在");
        }
        ThrowUtils.throwIf(userInterfaceInfo.getLeftNum() < 0, ErrorCode.PARAMS_ERROR, "接口剩余调用次数错误");
    }

    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        ThrowUtils.throwIf(interfaceInfoId <= 0 || userId <= 0, ErrorCode.PARAMS_ERROR);
        return this.lambdaUpdate()
                .eq(UserInterfaceInfo::getInterfaceInfoId, interfaceInfoId)
                .eq(UserInterfaceInfo::getUserId, userId)
                .gt(UserInterfaceInfo::getLeftNum, 0) // todo 剩余调用次数大于0（要考虑并发时加锁）
                .setSql("leftNum = leftNum - 1, totalNum = totalNum + 1")
                .update();
    }


}




