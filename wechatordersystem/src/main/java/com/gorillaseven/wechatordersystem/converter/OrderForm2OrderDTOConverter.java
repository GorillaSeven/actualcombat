package com.gorillaseven.wechatordersystem.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.gorillaseven.wechatordersystem.dto.CartDTO;
import com.gorillaseven.wechatordersystem.dto.OrderDTO;
import com.gorillaseven.wechatordersystem.entity.OrderDetail;
import com.gorillaseven.wechatordersystem.enums.ResultEnum;
import com.gorillaseven.wechatordersystem.exception.OrderException;
import com.gorillaseven.wechatordersystem.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc
 * @ClassName OrderForm2OrderDTOConverter
 * @Date 2019/5/31 17:35
 * @Created by Mr.Zeng
 */
@Slf4j
public class OrderForm2OrderDTOConverter {
    public static OrderDTO convert(OrderForm orderForm) {
        Gson gson = new Gson();
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getPhone());
        List<OrderDetail> orderDetailList = new ArrayList<>();
        try {
            orderDetailList = gson.fromJson(orderForm.getItems(), new TypeToken<List<OrderDetail>>() {
            }.getType());
        } catch (Exception e) {
            log.error("【对象转换】 错误，string={}", orderForm.getItems());
            throw new OrderException(ResultEnum.PARAM_ERROR);
        }
        orderDTO.setOrderDetailList(orderDetailList);
        return orderDTO;
    }
}
