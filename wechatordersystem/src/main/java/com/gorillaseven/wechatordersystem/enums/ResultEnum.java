package com.gorillaseven.wechatordersystem.enums;

import lombok.Getter;

/**
 * @Desc
 * @ClassName ResultEnum
 * @Date 2019/5/30 14:37
 * @Created by Mr.Zeng
 */
@Getter
public enum ResultEnum {
    PRODUCT_NOT_EXIST(1,"商品不存在"),
    PRODUCT_STOCK_NOT_ENOUGH(2,"商品库存不足"),
    ORDER_NOT_EXIST(3,"订单不存在"),
    ORDER_DETAIL_NOT_EXIST(4,"订单详情不存在"),
    ORDER_STATUS_ERROR(5,"订单状态异常"),
    ORDER_UPDATE_FAIL(6,"订单更新失败"),
    ORDER_DETAIL_EMPTY(7,"订单详情为空"),
    ORDER_PAY_STATUS_ERROR(8,"订单支付状态异常"),
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
