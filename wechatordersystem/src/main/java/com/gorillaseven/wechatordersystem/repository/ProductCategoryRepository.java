package com.gorillaseven.wechatordersystem.repository;

import com.gorillaseven.wechatordersystem.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName ProductCategoryRepository
 * @Date 2019/5/29 16:04
 * @Created by Mr.Zeng
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
