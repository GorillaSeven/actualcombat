package com.gorillaseven.wechatordersystem.entity;

/**
 * @ClassName ProductInfo
 * @Date 2019/5/29 15:18
 * @Created by Mr.Zeng
 */

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**商品*/
@Entity
@Data
public class ProductInfo {
    /** id*/
    @Id
    private String productId;
    /**名称*/
    private String productName;
    /**价格*/
    private BigDecimal productPrice;
    /**库存*/
    private Integer productStock;
    /**描述*/
    private String productDescription;
    /**图片*/
    private String productIcon;
    /**商品状态 0正常 1下架*/
    private Integer productStatus;
    /**类目编号*/
    private Integer categoryType;

    public ProductInfo() {
    }
}
