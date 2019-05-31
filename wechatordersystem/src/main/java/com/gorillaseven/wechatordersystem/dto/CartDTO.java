package com.gorillaseven.wechatordersystem.dto;

import lombok.Data;

/**
 * @Desc
 * @ClassName CartDTO
 * @Date 2019/5/31 14:39
 * @Created by Mr.Zeng
 */
@Data
public class CartDTO {
    /** 商品id*/
    private String productId;
    /** 商品数量 */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
