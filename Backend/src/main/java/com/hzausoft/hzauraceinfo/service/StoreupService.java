package com.hzausoft.hzauraceinfo.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.hzausoft.hzauraceinfo.entity.StoreupEntity;
import com.hzausoft.hzauraceinfo.entity.view.StoreupView;
import com.hzausoft.hzauraceinfo.entity.vo.StoreupVO;
import com.hzausoft.hzauraceinfo.utils.PageUtils;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 收藏表
 */
public interface StoreupService extends IService<StoreupEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<StoreupVO> selectListVO(Wrapper<StoreupEntity> wrapper);
   	
   	StoreupVO selectVO(@Param("ew") Wrapper<StoreupEntity> wrapper);
   	
   	List<StoreupView> selectListView(Wrapper<StoreupEntity> wrapper);
   	
   	StoreupView selectView(@Param("ew") Wrapper<StoreupEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<StoreupEntity> wrapper);
   	

}

