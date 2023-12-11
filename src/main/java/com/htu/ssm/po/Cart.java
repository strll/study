package com.htu.ssm.po;

import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName cart
 */
@Data
public class Cart implements Serializable {
    /**
     * 无意义编号购物车自增主键
     */
    private Integer cartId;

    /**
     * 食品编号
     */
    private Integer cartFoodId;

    /**
     * 所属用户编号
     */
    private Integer cartUserId;

    /**
     * 同一类型食品的购买数量
     */
    private Integer cartQuantity;

    /**
     * 金额
     */
    private Double cartMoney;

    private static final long serialVersionUID = 1L;
}