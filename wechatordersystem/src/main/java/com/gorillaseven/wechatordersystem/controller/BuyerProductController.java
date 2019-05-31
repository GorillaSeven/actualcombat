package com.gorillaseven.wechatordersystem.controller;

import com.gorillaseven.wechatordersystem.entity.ProductCategory;
import com.gorillaseven.wechatordersystem.entity.ProductInfo;
import com.gorillaseven.wechatordersystem.service.ProductCategoryService;
import com.gorillaseven.wechatordersystem.service.ProductInfoService;
import com.gorillaseven.wechatordersystem.utils.ResultVOUtil;
import com.gorillaseven.wechatordersystem.vo.ProductInfoVO;
import com.gorillaseven.wechatordersystem.vo.ProductVO;
import com.gorillaseven.wechatordersystem.vo.ResultVO;
import io.swagger.annotations.Api;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Desc 买家商品
 * @ClassName BuyerProductController
 * @Date 2019/5/30 11:30
 * @Created by Mr.Zeng
 */
@RestController
@RequestMapping(value = "/buyer/product")
@Api("BuyerProductController相关api")
public class BuyerProductController {
    @Autowired
    private ProductInfoService productInfoService;
    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping("/list")
    public ResultVO list(){
        //1. 查询所有的上架商品
        List<ProductInfo> productInfoList = productInfoService.findUpAll();
        //2. 查询类目(一次性查询)
        List<Integer> categoryList = productInfoList.stream().map(e -> e.getCategoryType()).collect(Collectors.toList());
        List<ProductCategory> productCategoryList = productCategoryService.findByCategoryTypeIn(categoryList);
        //3. 数据拼接
        List<ProductInfoVO> productInfoVOList = new ArrayList<>();
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory : productCategoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());
            for (ProductInfo productInfo : productInfoList) {
                if(productInfo.getCategoryType().equals(productCategory.getCategoryType())){
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo,productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }
        return ResultVOUtil.success(productVOList);
    }
}
