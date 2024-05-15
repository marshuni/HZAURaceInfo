package com.hzausoft.hzauraceinfo.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.hzausoft.hzauraceinfo.entity.GonggaolanEntity;
import com.hzausoft.hzauraceinfo.entity.view.GonggaolanView;
import com.hzausoft.hzauraceinfo.entity.vo.GonggaolanVO;
import com.hzausoft.hzauraceinfo.utils.PageUtils;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 公告栏
 */
public interface GonggaolanService extends IService<GonggaolanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GonggaolanVO> selectListVO(Wrapper<GonggaolanEntity> wrapper);
   	
   	GonggaolanVO selectVO(@Param("ew") Wrapper<GonggaolanEntity> wrapper);
   	
   	List<GonggaolanView> selectListView(Wrapper<GonggaolanEntity> wrapper);
   	
   	GonggaolanView selectView(@Param("ew") Wrapper<GonggaolanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GonggaolanEntity> wrapper);
   	

}

