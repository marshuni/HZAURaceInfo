package com.hzausoft.hzauraceinfo.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.hzausoft.hzauraceinfo.entity.DiscussjingsaixinxiEntity;
import com.hzausoft.hzauraceinfo.entity.view.DiscussjingsaixinxiView;
import com.hzausoft.hzauraceinfo.entity.vo.DiscussjingsaixinxiVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 竞赛信息评论表
 */
public interface DiscussjingsaixinxiDao extends BaseMapper<DiscussjingsaixinxiEntity> {
	
	List<DiscussjingsaixinxiVO> selectListVO(@Param("ew") Wrapper<DiscussjingsaixinxiEntity> wrapper);
	
	DiscussjingsaixinxiVO selectVO(@Param("ew") Wrapper<DiscussjingsaixinxiEntity> wrapper);
	
	List<DiscussjingsaixinxiView> selectListView(@Param("ew") Wrapper<DiscussjingsaixinxiEntity> wrapper);

	List<DiscussjingsaixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjingsaixinxiEntity> wrapper);
	
	DiscussjingsaixinxiView selectView(@Param("ew") Wrapper<DiscussjingsaixinxiEntity> wrapper);
	

}
