package com.gorillaseven.wechatordersystem.service.impl;

import com.gorillaseven.wechatordersystem.entity.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @ClassName ProductCategoryServiceImplTest
 * @Date 2019/5/30 9:40
 * @Created by Mr.Zeng
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceImplTest {

    @Autowired
    private ProductCategoryServiceImpl service;

    @Test
    public void findOne() {
        ProductCategory result = service.findOne(1);
        Assert.assertEquals(new Integer(1),result.getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> list = service.findAll();
        Assert.assertNotEquals(0,list.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> arrIds = Arrays.asList(2, 3, 4);
        List<ProductCategory> productCategories = service.findByCategoryTypeIn(arrIds);
        Assert.assertNotEquals(0,productCategories.size());
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory("男生专项", 10);
        ProductCategory save = service.save(productCategory);
        Assert.assertEquals(new Integer(10),save.getCategoryType());
    }
}