package com.gorillaseven.wechatordersystem.controller;

import com.gorillaseven.wechatordersystem.converter.OrderForm2OrderDTOConverter;
import com.gorillaseven.wechatordersystem.dto.OrderDTO;
import com.gorillaseven.wechatordersystem.enums.ResultEnum;
import com.gorillaseven.wechatordersystem.exception.OrderException;
import com.gorillaseven.wechatordersystem.form.OrderForm;
import com.gorillaseven.wechatordersystem.service.OrderMasterService;
import com.gorillaseven.wechatordersystem.utils.ResultVOUtil;
import com.gorillaseven.wechatordersystem.vo.ResultVO;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * @Desc
 * @ClassName BuyerOrderController
 * @Date 2019/5/31 17:20
 * @Created by Mr.Zeng
 */
@RestController
@RequestMapping("/buyer/order")
@Slf4j
@Api("BuyerOrderController相关api")
public class BuyerOrderController {
    @Autowired
    private OrderMasterService orderMasterService;

    //创建订单
    @GetMapping("/createorder")
    public ResultVO<Map<String,String>> create(@Valid OrderForm orderForm, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            log.error("【创建订单】 参数不正确，orderForm={}",orderForm);
            throw new OrderException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }
        OrderDTO orderDTO = OrderForm2OrderDTOConverter.convert(orderForm);
        if(CollectionUtils.isEmpty(orderDTO.getOrderDetailList())){
            log.error("【创建订单】 购物车不能为空");
            throw new OrderException(ResultEnum.CART_EMPTY);
        }
        OrderDTO createResult = orderMasterService.create(orderDTO);
        Map<String,String> map = new HashMap<>();
        map.put("orderId",createResult.getOrderId());
        return ResultVOUtil.success(map);
    }
    //订单列表
    //订单详情
    //取消订单
}
