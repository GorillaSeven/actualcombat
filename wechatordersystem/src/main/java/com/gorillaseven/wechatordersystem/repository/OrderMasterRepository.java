package com.gorillaseven.wechatordersystem.repository;

import com.gorillaseven.wechatordersystem.entity.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Desc
 * @ClassName OrderMasterRepository
 * @Date 2019/5/30 13:55
 * @Created by Mr.Zeng
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
