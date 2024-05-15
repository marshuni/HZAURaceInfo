package com.hzausoft.hzauraceinfo.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.hzausoft.hzauraceinfo.entity.YonghuEntity;
import com.hzausoft.hzauraceinfo.entity.view.YonghuView;
import com.hzausoft.hzauraceinfo.entity.vo.YonghuVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 用户
 */
public interface YonghuDao extends BaseMapper<YonghuEntity> {
	
	List<YonghuVO> selectListVO(@Param("ew") Wrapper<YonghuEntity> wrapper);
	
	YonghuVO selectVO(@Param("ew") Wrapper<YonghuEntity> wrapper);
	
	List<YonghuView> selectListView(@Param("ew") Wrapper<YonghuEntity> wrapper);

	List<YonghuView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuEntity> wrapper);
	
	YonghuView selectView(@Param("ew") Wrapper<YonghuEntity> wrapper);
	

}
