package com.htu.ssm.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName user
 */
@Data
public class User implements Serializable {
    /**
     * 用户主键
     */
    private Integer userId;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户登录名
     */
    private String userLogname;

    /**
     * 密码
     */
    private String userPass;

    /**
     * 性别
     */
    private String userSex;

    /**
     * 生日
     */
    private Date userBirth;

    /**
     * 头像路径
     */
    private String userImg;

    /**
     * 用户禁用（0禁用，1可用）
     */
    private Integer userStatus;

    private static final long serialVersionUID = 1L;
}