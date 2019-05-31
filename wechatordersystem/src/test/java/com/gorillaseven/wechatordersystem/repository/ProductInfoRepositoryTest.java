package com.gorillaseven.wechatordersystem.repository;

import com.gorillaseven.wechatordersystem.entity.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;


/**
 * @ClassName ProductInfoRepositoryTest
 * @Date 2019/5/30 9:55
 * @Created by Mr.Zeng
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {
    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void findByProductStatusTest(){
        List<ProductInfo> list = repository.findByProductStatus(0);
        Assert.assertNotEquals(0,list.size());
    }

    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("12345678");
        productInfo.setProductName("辣椒炒肉");
        productInfo.setProductPrice(new BigDecimal(14.00));
        productInfo.setProductStock(40);
        productInfo.setProductDescription("湖南月销售超过1千万的菜品！");
        productInfo.setProductIcon("http://xxxxxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);
        ProductInfo save = repository.save(productInfo);
        Assert.assertEquals(new Integer(2),save.getCategoryType());
    }
}