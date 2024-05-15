package com.hzausoft.hzauraceinfo.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.hzausoft.hzauraceinfo.entity.JingsaifenleiEntity;
import com.hzausoft.hzauraceinfo.entity.view.JingsaifenleiView;
import com.hzausoft.hzauraceinfo.entity.vo.JingsaifenleiVO;
import com.hzausoft.hzauraceinfo.utils.PageUtils;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 竞赛分类
 */
public interface JingsaifenleiService extends IService<JingsaifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingsaifenleiVO> selectListVO(Wrapper<JingsaifenleiEntity> wrapper);
   	
   	JingsaifenleiVO selectVO(@Param("ew") Wrapper<JingsaifenleiEntity> wrapper);
   	
   	List<JingsaifenleiView> selectListView(Wrapper<JingsaifenleiEntity> wrapper);
   	
   	JingsaifenleiView selectView(@Param("ew") Wrapper<JingsaifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingsaifenleiEntity> wrapper);
   	

}

