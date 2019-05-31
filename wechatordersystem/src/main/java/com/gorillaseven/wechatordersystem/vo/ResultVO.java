package com.gorillaseven.wechatordersystem.vo;

import lombok.Data;

/**
 * @Desc http请求返回最外层对象
 * @ClassName ResultVO
 * @Date 2019/5/30 11:35
 * @Created by Mr.Zeng
 */
@Data
public class ResultVO<T> {
    /** 错误码 */
    private Integer code;
    /** 提示信息 */
    private String  msg;
    /** 对应传输数据信息 */
    private T data;
}
