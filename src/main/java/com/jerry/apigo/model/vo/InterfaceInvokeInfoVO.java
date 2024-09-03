package com.jerry.apigo.model.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 接口信息封装视图
 */
@Data
public class InterfaceInvokeInfoVO implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 调用次数
     */
    private Integer totalNum;

    private static final long serialVersionUID = 1L;
}
