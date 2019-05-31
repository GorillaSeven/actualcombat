package com.gorillaseven.wechatordersystem.service.impl;

import com.gorillaseven.wechatordersystem.entity.ProductInfo;
import com.gorillaseven.wechatordersystem.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @ClassName ProductInfoServiceImplTest
 * @Date 2019/5/30 10:42
 * @Created by Mr.Zeng
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoServiceImpl service;

    @Test
    public void findOne() {
        ProductInfo productInfo = service.findOne("12345678");
        Assert.assertNotNull(productInfo);
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> list = service.findUpAll();
        Assert.assertNotEquals(0,list.size());
    }

    @Test
    public void findAll() {
        PageRequest req = PageRequest.of(0, 2);
        Page<ProductInfo> productInfoPages = service.findAll(req);
//        System.out.println(productInfoPages.getTotalElements());
        Assert.assertNotEquals(0,productInfoPages.getTotalElements());
    }


    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("23456789");
        productInfo.setProductName("宫保鸡丁");
        productInfo.setProductPrice(new BigDecimal(15));
        productInfo.setProductStock(60);
        productInfo.setProductIcon("http://XXXXX.jpg");
        productInfo.setProductDescription("一道北方经典名菜");
        productInfo.setProductStatus(ProductStatusEnum.UP.getCode());
        productInfo.setCategoryType(2);
        ProductInfo save = service.save(productInfo);
        Assert.assertNotNull(save);
    }
}