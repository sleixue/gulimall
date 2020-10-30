package com.example.gulimall.product.dao;

import com.example.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author slx
 * @email 905096784@qq.com
 * @date 2020-10-28 17:51:26
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
