package com.example.gulimall.member.dao;

import com.example.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author slx
 * @email 905096784@qq.com
 * @date 2020-10-29 13:42:48
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
