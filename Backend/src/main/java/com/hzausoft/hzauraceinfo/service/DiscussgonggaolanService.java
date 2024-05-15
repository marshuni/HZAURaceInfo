package com.hzausoft.hzauraceinfo.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.hzausoft.hzauraceinfo.entity.DiscussgonggaolanEntity;
import com.hzausoft.hzauraceinfo.entity.view.DiscussgonggaolanView;
import com.hzausoft.hzauraceinfo.entity.vo.DiscussgonggaolanVO;
import com.hzausoft.hzauraceinfo.utils.PageUtils;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 公告栏评论表
 */
public interface DiscussgonggaolanService extends IService<DiscussgonggaolanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussgonggaolanVO> selectListVO(Wrapper<DiscussgonggaolanEntity> wrapper);
   	
   	DiscussgonggaolanVO selectVO(@Param("ew") Wrapper<DiscussgonggaolanEntity> wrapper);
   	
   	List<DiscussgonggaolanView> selectListView(Wrapper<DiscussgonggaolanEntity> wrapper);
   	
   	DiscussgonggaolanView selectView(@Param("ew") Wrapper<DiscussgonggaolanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussgonggaolanEntity> wrapper);
   	

}

