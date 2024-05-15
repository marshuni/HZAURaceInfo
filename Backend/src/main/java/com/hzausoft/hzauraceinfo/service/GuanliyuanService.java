package com.hzausoft.hzauraceinfo.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.hzausoft.hzauraceinfo.entity.GuanliyuanEntity;
import com.hzausoft.hzauraceinfo.entity.view.GuanliyuanView;
import com.hzausoft.hzauraceinfo.entity.vo.GuanliyuanVO;
import com.hzausoft.hzauraceinfo.utils.PageUtils;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 管理员
 */
public interface GuanliyuanService extends IService<GuanliyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<GuanliyuanVO> selectListVO(Wrapper<GuanliyuanEntity> wrapper);

    GuanliyuanVO selectVO(@Param("ew") Wrapper<GuanliyuanEntity> wrapper);

    List<GuanliyuanView> selectListView(Wrapper<GuanliyuanEntity> wrapper);

    GuanliyuanView selectView(@Param("ew") Wrapper<GuanliyuanEntity> wrapper);

    PageUtils queryPage(Map<String, Object> params,Wrapper<GuanliyuanEntity> wrapper);


}

