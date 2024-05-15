package com.hzausoft.hzauraceinfo.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.hzausoft.hzauraceinfo.entity.JingsaixinxiEntity;
import com.hzausoft.hzauraceinfo.entity.view.JingsaixinxiView;
import com.hzausoft.hzauraceinfo.entity.vo.JingsaixinxiVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 竞赛信息
 */
public interface JingsaixinxiDao extends BaseMapper<JingsaixinxiEntity> {
	
	List<JingsaixinxiVO> selectListVO(@Param("ew") Wrapper<JingsaixinxiEntity> wrapper);
	
	JingsaixinxiVO selectVO(@Param("ew") Wrapper<JingsaixinxiEntity> wrapper);
	
	List<JingsaixinxiView> selectListView(@Param("ew") Wrapper<JingsaixinxiEntity> wrapper);

	List<JingsaixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JingsaixinxiEntity> wrapper);
	
	JingsaixinxiView selectView(@Param("ew") Wrapper<JingsaixinxiEntity> wrapper);
	

}
