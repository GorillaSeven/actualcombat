package com.gorillaseven.wechatordersystem.utils;

import java.time.Instant;
import java.util.Random;

/**
 * @Desc
 * @ClassName KeyUtil
 * @Date 2019/5/30 14:49
 * @Created by Mr.Zeng
 */
public class KeyUtil {
    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     * @return
     */
    public static synchronized String generateUniqueKey(){
        Random random = new Random();
        int number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
