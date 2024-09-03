package com.jerry.apigo.controller;

import com.apigo.apigocommon.model.entity.UserInterfaceInfo;
import com.jerry.apigo.annotation.AuthCheck;
import com.jerry.apigo.common.BaseResponse;
import com.jerry.apigo.common.ResultUtils;
import com.jerry.apigo.mapper.UserInterfaceInfoMapper;
import com.jerry.apigo.model.vo.InterfaceInvokeInfoVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/analysis")
@Slf4j
public class AnalysisController {
    @Resource
    private UserInterfaceInfoMapper userInterfaceInfoMapper;

    @GetMapping("/top/interface/invoke")
    @AuthCheck(mustRole = "admin")
    public BaseResponse<List<InterfaceInvokeInfoVO>> listTopInterfaceInfo() {
        List<InterfaceInvokeInfoVO> userInterfaceInfoList = userInterfaceInfoMapper.listTopInvokeInterfaceInfo(3);
        return ResultUtils.success(userInterfaceInfoList);
    }
}
