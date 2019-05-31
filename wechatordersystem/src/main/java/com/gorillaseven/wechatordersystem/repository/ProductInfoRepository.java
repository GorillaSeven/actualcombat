package com.gorillaseven.wechatordersystem.repository;

import com.gorillaseven.wechatordersystem.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName ProductInfoRepository
 * @Date 2019/5/30 9:50
 * @Created by Mr.Zeng
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
