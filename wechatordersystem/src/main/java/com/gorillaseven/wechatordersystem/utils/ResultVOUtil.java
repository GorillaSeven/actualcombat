package com.gorillaseven.wechatordersystem.utils;

import com.gorillaseven.wechatordersystem.vo.ResultVO;

/**
 * @Desc
 * @ClassName ResultVOUtil
 * @Date 2019/5/30 13:39
 * @Created by Mr.Zeng
 */
public class ResultVOUtil {

    public static ResultVO success(Object o){
        ResultVO<Object> resultVO = new ResultVO<>();
        resultVO.setData(o);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO error(Integer code,String msg){
        ResultVO<Object> resultVO = new ResultVO<>();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        resultVO.setData(null);
        return resultVO;
    }
}
