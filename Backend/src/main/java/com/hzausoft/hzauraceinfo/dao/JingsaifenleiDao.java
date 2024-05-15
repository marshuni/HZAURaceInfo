package com.hzausoft.hzauraceinfo.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.hzausoft.hzauraceinfo.entity.JingsaifenleiEntity;
import com.hzausoft.hzauraceinfo.entity.view.JingsaifenleiView;
import com.hzausoft.hzauraceinfo.entity.vo.JingsaifenleiVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 竞赛分类
 */
public interface JingsaifenleiDao extends BaseMapper<JingsaifenleiEntity> {
	
	List<JingsaifenleiVO> selectListVO(@Param("ew") Wrapper<JingsaifenleiEntity> wrapper);
	
	JingsaifenleiVO selectVO(@Param("ew") Wrapper<JingsaifenleiEntity> wrapper);
	
	List<JingsaifenleiView> selectListView(@Param("ew") Wrapper<JingsaifenleiEntity> wrapper);

	List<JingsaifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<JingsaifenleiEntity> wrapper);
	
	JingsaifenleiView selectView(@Param("ew") Wrapper<JingsaifenleiEntity> wrapper);
	

}
