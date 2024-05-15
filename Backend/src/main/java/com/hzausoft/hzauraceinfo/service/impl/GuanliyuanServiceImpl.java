package com.hzausoft.hzauraceinfo.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hzausoft.hzauraceinfo.dao.GuanliyuanDao;
import com.hzausoft.hzauraceinfo.entity.GuanliyuanEntity;
import com.hzausoft.hzauraceinfo.entity.view.GuanliyuanView;
import com.hzausoft.hzauraceinfo.entity.vo.GuanliyuanVO;
import com.hzausoft.hzauraceinfo.service.GuanliyuanService;
import com.hzausoft.hzauraceinfo.utils.PageUtils;
import com.hzausoft.hzauraceinfo.utils.Query;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("guanliyuanService")
public class GuanliyuanServiceImpl extends ServiceImpl<GuanliyuanDao, GuanliyuanEntity> implements GuanliyuanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuanliyuanEntity> page = this.selectPage(
                new Query<GuanliyuanEntity>(params).getPage(),
                new EntityWrapper<GuanliyuanEntity>()
        );
        return new PageUtils(page);
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params, Wrapper<GuanliyuanEntity> wrapper) {
        Page<GuanliyuanView> page =new Query<GuanliyuanView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,wrapper));
        PageUtils pageUtil = new PageUtils(page);
        return pageUtil;
    }

    @Override
    public List<GuanliyuanVO> selectListVO(Wrapper<GuanliyuanEntity> wrapper) {
        return baseMapper.selectListVO(wrapper);
    }

    @Override
    public GuanliyuanVO selectVO(Wrapper<GuanliyuanEntity> wrapper) {
        return baseMapper.selectVO(wrapper);
    }

    @Override
    public List<GuanliyuanView> selectListView(Wrapper<GuanliyuanEntity> wrapper) {
        return baseMapper.selectListView(wrapper);
    }

    @Override
    public GuanliyuanView selectView(Wrapper<GuanliyuanEntity> wrapper) {
        return baseMapper.selectView(wrapper);
    }


}
