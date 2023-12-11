package com.htu.ssm.po;

import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName cate
 */
@Data
public class Cate implements Serializable {
    /**
     * 分类编号
     */
    private Integer cateId;

    /**
     * 分类名称
     */
    private String cateName;

    /**
     * 分类描述
     */
    private String cateDesc;

    private static final long serialVersionUID = 1L;
}