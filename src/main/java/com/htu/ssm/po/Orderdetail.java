package com.htu.ssm.po;

import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName orderdetail
 */
@Data
public class Orderdetail implements Serializable {
    /**
     * 订单明细编号
     */
    private Integer odId;

    /**
     * 所属订单编号
     */
    private Integer odOrderId;

    /**
     * 所属食品编号
     */
    private Integer odFoodId;

    /**
     * 数量
     */
    private Integer odQuantity;

    /**
     * 金额
     */
    private Double odTotal;

    private static final long serialVersionUID = 1L;
}