package com.jerry.apigo.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 请求参数为id的请求
*/
@Data
public class IdRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}