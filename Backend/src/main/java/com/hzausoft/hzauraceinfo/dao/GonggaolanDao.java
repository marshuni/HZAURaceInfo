package com.hzausoft.hzauraceinfo.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.hzausoft.hzauraceinfo.entity.GonggaolanEntity;
import com.hzausoft.hzauraceinfo.entity.view.GonggaolanView;
import com.hzausoft.hzauraceinfo.entity.vo.GonggaolanVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 公告栏
 */
public interface GonggaolanDao extends BaseMapper<GonggaolanEntity> {
	
	List<GonggaolanVO> selectListVO(@Param("ew") Wrapper<GonggaolanEntity> wrapper);
	
	GonggaolanVO selectVO(@Param("ew") Wrapper<GonggaolanEntity> wrapper);
	
	List<GonggaolanView> selectListView(@Param("ew") Wrapper<GonggaolanEntity> wrapper);

	List<GonggaolanView> selectListView(Pagination page,@Param("ew") Wrapper<GonggaolanEntity> wrapper);
	
	GonggaolanView selectView(@Param("ew") Wrapper<GonggaolanEntity> wrapper);
	

}
