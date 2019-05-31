package com.gorillaseven.wechatordersystem.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @Desc 商品(包含类目)
 * @ClassName ProductVO
 * @Date 2019/5/30 11:42
 * @Created by Mr.Zeng
 */
@Data
public class ProductVO {
    @JsonProperty("name")
    private String categoryName;
    @JsonProperty("type")
    private Integer categoryType;
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
