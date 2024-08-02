package com.jerry.apigo.model.vo;

import cn.hutool.json.JSONUtil;
import com.jerry.apigo.model.entity.Post;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 接口信息封装视图
*/
@Data
public class InterfaceInfoVO implements Serializable {

    /**
     * 调用次数
     */
    private Integer totalNum;

    private static final long serialVersionUID = 1L;
}
