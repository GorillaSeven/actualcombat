package com.gorillaseven.wechatordersystem.service;

import com.gorillaseven.wechatordersystem.dto.CartDTO;
import com.gorillaseven.wechatordersystem.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @ClassName ProductInfoService
 * @Date 2019/5/30 10:08
 * @Created by Mr.Zeng
 */
public interface ProductInfoService {
    ProductInfo findOne(String productId);

    /**
     * 查询所有在架的商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void  increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void  decreaseStock(List<CartDTO> cartDTOList);
}
