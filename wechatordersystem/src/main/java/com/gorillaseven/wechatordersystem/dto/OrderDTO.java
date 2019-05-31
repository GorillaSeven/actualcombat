package com.gorillaseven.wechatordersystem.dto;

import com.gorillaseven.wechatordersystem.entity.OrderDetail;
import com.gorillaseven.wechatordersystem.enums.OrderStatusEnum;
import com.gorillaseven.wechatordersystem.enums.PayStatusEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Desc
 * @ClassName OrderDTO
 * @Date 2019/5/30 14:23
 * @Created by Mr.Zeng
 */
@Data
public class OrderDTO {
    private String orderId;
    /**买家名字*/
    private String buyerName;
    /**买家电话*/
    private String buyerPhone;
    /**买家地址*/
    private String buyerAddress;
    /**买家微信openid*/
    private String buyerOpenid;
    /**订单总金额*/
    private BigDecimal orderAmount;
    /**订单状态，默认0新下单*/
    private Integer orderStatus;
    /**支付状态，默认0未支付*/
    private Integer payStatus;
    /** 创建时间*/
    private Date createTime;
    /** 更新时间 */
    private Date updateTime;

    private List<OrderDetail> orderDetailList;
}
