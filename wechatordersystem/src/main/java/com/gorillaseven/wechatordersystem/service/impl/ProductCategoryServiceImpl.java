package com.gorillaseven.wechatordersystem.service.impl;

import com.gorillaseven.wechatordersystem.entity.ProductCategory;
import com.gorillaseven.wechatordersystem.repository.ProductCategoryRepository;
import com.gorillaseven.wechatordersystem.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ProductCategoryServiceImpl
 * @Date 2019/5/30 9:38
 * @Created by Mr.Zeng
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repository.findById(categoryId).get();
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
