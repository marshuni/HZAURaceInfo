package com.hzausoft.hzauraceinfo.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.hzausoft.hzauraceinfo.entity.JingsaixinxiEntity;
import com.hzausoft.hzauraceinfo.entity.view.JingsaixinxiView;
import com.hzausoft.hzauraceinfo.entity.vo.JingsaixinxiVO;
import com.hzausoft.hzauraceinfo.utils.PageUtils;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 竞赛信息
 */
public interface JingsaixinxiService extends IService<JingsaixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingsaixinxiVO> selectListVO(Wrapper<JingsaixinxiEntity> wrapper);
   	
   	JingsaixinxiVO selectVO(@Param("ew") Wrapper<JingsaixinxiEntity> wrapper);
   	
   	List<JingsaixinxiView> selectListView(Wrapper<JingsaixinxiEntity> wrapper);
   	
   	JingsaixinxiView selectView(@Param("ew") Wrapper<JingsaixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingsaixinxiEntity> wrapper);
   	

}

