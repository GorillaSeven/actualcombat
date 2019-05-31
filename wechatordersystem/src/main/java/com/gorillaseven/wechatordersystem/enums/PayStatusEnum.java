package com.gorillaseven.wechatordersystem.enums;

import lombok.Getter;

/**
 * @Desc
 * @ClassName PayStatusEnum
 * @Date 2019/5/30 13:49
 * @Created by Mr.Zeng
 */
@Getter
public enum PayStatusEnum {
    WAIT(0,"未支付"),
    SUCCESS(1,"支付成功")
    ;
    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }}
