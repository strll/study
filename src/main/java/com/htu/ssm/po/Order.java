package com.htu.ssm.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName order
 */
@Data
public class Order implements Serializable {
    /**
     * 订单编号
     */
    private Integer orderId;

    /**
     * 所属用户编号
     */
    private Integer orderUserId;

    /**
     * 订购日期
     */
    private Date orderDate;

    /**
     * 订单总价
     */
    private Double orderTotal;

    /**
     * 所属送货地址编号
     */
    private Integer orderAdId;

    /**
     * 订单状态
     */
    private Integer orderState;

    private static final long serialVersionUID = 1L;
}