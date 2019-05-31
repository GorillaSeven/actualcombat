package com.gorillaseven.wechatordersystem.repository;

import com.gorillaseven.wechatordersystem.entity.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Desc
 * @ClassName OrderDetailRepositoryTest
 * @Date 2019/5/30 14:11
 * @Created by Mr.Zeng
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {
    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("11111111111");
        orderDetail.setOrderId("1233444555662266666666");
        orderDetail.setProductIcon("http://xxxx.jpg");
        orderDetail.setProductId("12345678");
        orderDetail.setProductName("辣椒炒肉");
        orderDetail.setProductPrice(new BigDecimal(14));
        orderDetail.setProductQuantity(2);
        OrderDetail save = repository.save(orderDetail);
        Assert.assertNotNull(save);
    }

    @Test
    public void findByOrderIdTest(){
        List<OrderDetail> byOrderId = repository.findByOrderId("11111111111");
        Assert.assertNotEquals(0,byOrderId.size());
    }
}