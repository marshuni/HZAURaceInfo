package com.hzausoft.hzauraceinfo.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.hzausoft.hzauraceinfo.entity.YonghuEntity;
import com.hzausoft.hzauraceinfo.entity.view.YonghuView;
import com.hzausoft.hzauraceinfo.entity.vo.YonghuVO;
import com.hzausoft.hzauraceinfo.utils.PageUtils;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 用户
 */
public interface YonghuService extends IService<YonghuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuVO> selectListVO(Wrapper<YonghuEntity> wrapper);
   	
   	YonghuVO selectVO(@Param("ew") Wrapper<YonghuEntity> wrapper);
   	
   	List<YonghuView> selectListView(Wrapper<YonghuEntity> wrapper);
   	
   	YonghuView selectView(@Param("ew") Wrapper<YonghuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuEntity> wrapper);
   	

}

