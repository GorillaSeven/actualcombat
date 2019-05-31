package com.gorillaseven.wechatordersystem.exception;

import com.gorillaseven.wechatordersystem.enums.ResultEnum;

/**
 * @Desc
 * @ClassName OrderException
 * @Date 2019/5/30 14:36
 * @Created by Mr.Zeng
 */
public class OrderException extends RuntimeException {
    private Integer code;

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public OrderException(Integer code,String message) {
        super(message);
        this.code = code;
    }

}
