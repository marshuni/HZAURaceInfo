package com.hzausoft.hzauraceinfo.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.hzausoft.hzauraceinfo.entity.DiscussjingsaixinxiEntity;
import com.hzausoft.hzauraceinfo.entity.view.DiscussjingsaixinxiView;
import com.hzausoft.hzauraceinfo.entity.vo.DiscussjingsaixinxiVO;
import com.hzausoft.hzauraceinfo.utils.PageUtils;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 竞赛信息评论表
 */
public interface DiscussjingsaixinxiService extends IService<DiscussjingsaixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjingsaixinxiVO> selectListVO(Wrapper<DiscussjingsaixinxiEntity> wrapper);
   	
   	DiscussjingsaixinxiVO selectVO(@Param("ew") Wrapper<DiscussjingsaixinxiEntity> wrapper);
   	
   	List<DiscussjingsaixinxiView> selectListView(Wrapper<DiscussjingsaixinxiEntity> wrapper);
   	
   	DiscussjingsaixinxiView selectView(@Param("ew") Wrapper<DiscussjingsaixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjingsaixinxiEntity> wrapper);
   	

}

