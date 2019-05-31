package com.gorillaseven.wechatordersystem.repository;

import com.gorillaseven.wechatordersystem.entity.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @Desc
 * @ClassName OrderMasterRepositoryTest
 * @Date 2019/5/30 13:59
 * @Created by Mr.Zeng
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {
    @Autowired
    private OrderMasterRepository repository;
    public static final String OPENID = "11111111";
    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1233444555662266666666");
        orderMaster.setBuyerAddress("长沙市岳麓区");
        orderMaster.setBuyerName("李四");
        orderMaster.setBuyerPhone("13789740934");
        orderMaster.setOrderAmount(new BigDecimal(56));
        orderMaster.setOrderStatus(0);
        orderMaster.setPayStatus(0);
        orderMaster.setBuyerOpenid(OPENID);
        OrderMaster save = repository.save(orderMaster);
        Assert.assertNotNull(save);
    }

    @Test
    public void findByBuyerOpenidTest(){
        PageRequest request = PageRequest.of(0, 2);
        Page<OrderMaster> orderMasterPages = repository.findByBuyerOpenid(OPENID, request);
        Assert.assertNotEquals(0,orderMasterPages.getTotalElements());
    }
}