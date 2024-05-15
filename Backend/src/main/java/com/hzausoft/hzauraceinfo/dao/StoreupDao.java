package com.hzausoft.hzauraceinfo.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.hzausoft.hzauraceinfo.entity.StoreupEntity;
import com.hzausoft.hzauraceinfo.entity.view.StoreupView;
import com.hzausoft.hzauraceinfo.entity.vo.StoreupVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 收藏表
 */
public interface StoreupDao extends BaseMapper<StoreupEntity> {
	
	List<StoreupVO> selectListVO(@Param("ew") Wrapper<StoreupEntity> wrapper);
	
	StoreupVO selectVO(@Param("ew") Wrapper<StoreupEntity> wrapper);
	
	List<StoreupView> selectListView(@Param("ew") Wrapper<StoreupEntity> wrapper);

	List<StoreupView> selectListView(Pagination page,@Param("ew") Wrapper<StoreupEntity> wrapper);
	
	StoreupView selectView(@Param("ew") Wrapper<StoreupEntity> wrapper);
	

}
