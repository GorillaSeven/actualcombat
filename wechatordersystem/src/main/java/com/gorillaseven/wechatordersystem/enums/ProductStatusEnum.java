package com.gorillaseven.wechatordersystem.enums;

import lombok.Getter;

/**
 * @ClassName ProductStatusEnum
 * @Date 2019/5/30 10:37
 * @Created by Mr.Zeng
 * 商品状态
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架");

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }}
