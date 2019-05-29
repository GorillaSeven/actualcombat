package com.gorillaseven.wechatordersystem.entity;

/**
 * @ClassName OrderDetail
 * @Date 2019/5/29 15:28
 * @Created by Mr.Zeng
 */

import java.util.Date;

/**订单详情*/
public class OrderDetail {
    /**id*/
    private String detailId;
    /**订单id*/
    private String orderId;
    /**商品id*/
    private String productId;
    /**商品名字*/
    private String productName;
    /**商品价格*/
    private double productPrice;
    /**商品数量*/
    private int productQuantity;
    /**商品图片*/
    private String productIcon;


    public OrderDetail() {
    }

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductIcon() {
        return productIcon;
    }

    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon;
    }


}
