package com.hzausoft.hzauraceinfo.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.hzausoft.hzauraceinfo.entity.GuanliyuanEntity;
import com.hzausoft.hzauraceinfo.entity.view.GuanliyuanView;
import com.hzausoft.hzauraceinfo.entity.vo.GuanliyuanVO;

import org.apache.ibatis.annotations.Param;
/**
 * 管理员
 */
public interface GuanliyuanDao extends BaseMapper<GuanliyuanEntity>{
    List<GuanliyuanVO> selectListVO(@Param("ew") Wrapper<GuanliyuanEntity> wrapper);

    GuanliyuanVO selectVO(@Param("ew") Wrapper<GuanliyuanEntity> wrapper);

    List<GuanliyuanView> selectListView(@Param("ew") Wrapper<GuanliyuanEntity> wrapper);

    List<GuanliyuanView> selectListView(Pagination page,@Param("ew") Wrapper<GuanliyuanEntity> wrapper);

    GuanliyuanView selectView(@Param("ew") Wrapper<GuanliyuanEntity> wrapper);
}

