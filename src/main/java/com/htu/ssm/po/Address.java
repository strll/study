package com.htu.ssm.po;

import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName address
 */
@Data
public class Address implements Serializable {
    /**
     * 送货地址编号
     */
    private Integer adId;

    /**
     * 联系人姓名
     */
    private String adContactname;

    /**
     * 联系人电话
     */
    private String adContacttel;

    /**
     * 送货地址
     */
    private String adAddress;

    /**
     * 所属用户编号
     */
    private Integer adUserId;

    private static final long serialVersionUID = 1L;
}