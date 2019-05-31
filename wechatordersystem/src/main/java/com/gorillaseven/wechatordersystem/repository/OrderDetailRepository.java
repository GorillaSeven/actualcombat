package com.gorillaseven.wechatordersystem.repository;

import com.gorillaseven.wechatordersystem.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Desc
 * @ClassName OrderDetailRepository
 * @Date 2019/5/30 13:58
 * @Created by Mr.Zeng
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
    List<OrderDetail> findByOrderId(String orderid);
}
