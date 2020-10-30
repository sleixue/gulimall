package com.example.gulimall.order.dao;

import com.example.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author slx
 * @email 905096784@qq.com
 * @date 2020-10-29 13:52:31
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
