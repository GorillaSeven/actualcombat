package com.gorillaseven.wechatordersystem.service.impl;

import com.gorillaseven.wechatordersystem.dto.OrderDTO;
import com.gorillaseven.wechatordersystem.entity.OrderDetail;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Desc
 * @ClassName OrderMasterServiceImplTest
 * @Date 2019/5/31 14:56
 * @Created by Mr.Zeng
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderMasterServiceImplTest {
    @Autowired
    private OrderMasterServiceImpl orderMasterService;

    public static final String OPENID = "110110";
    public static final String ORDER_ID = "1559288610117748923";
    @Test
    public void create() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerAddress("长沙市");
        orderDTO.setBuyerName("张三");
        orderDTO.setBuyerPhone("12344567788");
        orderDTO.setBuyerOpenid(OPENID);
        //购物车
        List<OrderDetail> orderDetailList = new ArrayList<>();
        OrderDetail orderDetail1 = new OrderDetail();
        orderDetail1.setProductId("12345678");
        orderDetail1.setProductQuantity(1);
        orderDetailList.add(orderDetail1);
        orderDTO.setOrderDetailList(orderDetailList);
        OrderDTO result = orderMasterService.create(orderDTO);
        log.info("result {}",result);
    }

    @Test
    public void findOne() {
        OrderDTO orderDTO = orderMasterService.findOne(ORDER_ID);
        log.info("查询订单：{}",orderDTO);
    }

    @Test
    public void findList() {
        Page<OrderDTO> list = orderMasterService.findList(OPENID, PageRequest.of(0, 3));
        log.info("【查询订单list】:{}",list);
        Assert.assertNotEquals(0,list.getTotalElements());
    }

    @Test
    public void cancel() {
        OrderDTO orderDTO = orderMasterService.findOne(ORDER_ID);
        OrderDTO cancel = orderMasterService.cancel(orderDTO);
        Assert.assertEquals(orderDTO.getOrderStatus(),cancel.getOrderStatus());
    }

    @Test
    public void finish() {
        OrderDTO orderDTO = orderMasterService.findOne(ORDER_ID);
        OrderDTO finish = orderMasterService.finish(orderDTO);
        Assert.assertEquals(orderDTO.getOrderStatus(),finish.getOrderStatus());
    }

    @Test
    public void pay() {
        OrderDTO orderDTO = orderMasterService.findOne(ORDER_ID);
        OrderDTO finish = orderMasterService.pay(orderDTO);
        Assert.assertEquals(orderDTO.getOrderStatus(),finish.getOrderStatus());
    }
}