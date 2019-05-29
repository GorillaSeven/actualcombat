package com.gorillaseven.wechatordersystem.repository;

import com.gorillaseven.wechatordersystem.entity.ProductCategory;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;


/**
 * @ClassName ProductCategoryRepositoryTest
 * @Date 2019/5/29 16:11
 * @Created by Mr.Zeng
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    @Ignore
    public void findOneTest(){
        ProductCategory productCategory = repository.findById(1).get();
        System.out.println(productCategory.toString());
    }

    @Test
    @Transactional
    @Ignore
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("男生最爱",5);
        ProductCategory save = repository.save(productCategory);
        Assert.assertNotNull(save);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2, 3, 4);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }

}