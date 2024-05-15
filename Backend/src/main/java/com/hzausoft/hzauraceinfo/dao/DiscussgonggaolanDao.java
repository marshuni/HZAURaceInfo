package com.hzausoft.hzauraceinfo.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.hzausoft.hzauraceinfo.entity.DiscussgonggaolanEntity;
import com.hzausoft.hzauraceinfo.entity.view.DiscussgonggaolanView;
import com.hzausoft.hzauraceinfo.entity.vo.DiscussgonggaolanVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 公告栏评论表
 */
public interface DiscussgonggaolanDao extends BaseMapper<DiscussgonggaolanEntity> {
	
	List<DiscussgonggaolanVO> selectListVO(@Param("ew") Wrapper<DiscussgonggaolanEntity> wrapper);
	
	DiscussgonggaolanVO selectVO(@Param("ew") Wrapper<DiscussgonggaolanEntity> wrapper);
	
	List<DiscussgonggaolanView> selectListView(@Param("ew") Wrapper<DiscussgonggaolanEntity> wrapper);

	List<DiscussgonggaolanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussgonggaolanEntity> wrapper);
	
	DiscussgonggaolanView selectView(@Param("ew") Wrapper<DiscussgonggaolanEntity> wrapper);
	

}
