package com.gorillaseven.wechatordersystem.entity;

/**
 * @ClassName OrderDetail
 * @Date 2019/5/29 15:28
 * @Created by Mr.Zeng
 */

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**订单详情*/
@Data
@Entity
public class OrderDetail {
    /**id*/
    @Id
    private String detailId;
    /**订单id*/
    private String orderId;
    /**商品id*/
    private String productId;
    /**商品名字*/
    private String productName;
    /**商品价格*/
    private BigDecimal productPrice;
    /**商品数量*/
    private Integer productQuantity;
    /**商品图片*/
    private String productIcon;

    public OrderDetail() {
    }



}
