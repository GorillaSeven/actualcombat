package com.gorillaseven.wechatordersystem.entity;

/**
 * @ClassName ProductInfo
 * @Date 2019/5/29 15:18
 * @Created by Mr.Zeng
 */

import java.util.Date;

/**商品*/
public class ProductInfo {
    /** id*/
    private int productId;
    /**名称*/
    private String productName;
    /**价格*/
    private double productPrice;
    /**库存*/
    private int productStock;
    /**描述*/
    private String productDescription;
    /**图片*/
    private String productIcon;
    /**类目编号*/
    private int categoryType;

    public ProductInfo() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
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

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductIcon() {
        return productIcon;
    }

    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon;
    }

    public int getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(int categoryType) {
        this.categoryType = categoryType;
    }

}
