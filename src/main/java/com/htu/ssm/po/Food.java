package com.htu.ssm.po;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @TableName food
 */
@Data
public class Food implements Serializable {
    /**
     * 食品编号
     */
    private Integer foodId;

    /**
     * 食品名称
     */
    private String foodName;

    /**
     * 食品介绍
     */
    private String foodExplain;

    /**
     * 食品图片
     */
    private String foodImg;

    /**
     * 食品价格
     */
    private BigDecimal foodPrice;

    /**
     * 备注
     */
    private String foodRemarks;

    /**
     * 是否启用
     */
    private Integer foodStatus;

    /**
     * 食品分类
     */
    private Integer foodCateId;



    private static final long serialVersionUID = 1L;
}