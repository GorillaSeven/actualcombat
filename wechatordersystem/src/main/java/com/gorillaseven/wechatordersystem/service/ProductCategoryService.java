package com.gorillaseven.wechatordersystem.service;

import com.gorillaseven.wechatordersystem.entity.ProductCategory;

import java.util.List;

/**
 * @ClassName ProductCategoryService
 * @Date 2019/5/30 9:35
 * @Created by Mr.Zeng
 */
public interface ProductCategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
