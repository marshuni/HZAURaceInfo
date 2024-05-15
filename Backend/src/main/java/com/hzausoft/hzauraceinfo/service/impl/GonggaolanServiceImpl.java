package com.hzausoft.hzauraceinfo.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hzausoft.hzauraceinfo.dao.GonggaolanDao;
import com.hzausoft.hzauraceinfo.entity.GonggaolanEntity;
import com.hzausoft.hzauraceinfo.entity.view.GonggaolanView;
import com.hzausoft.hzauraceinfo.entity.vo.GonggaolanVO;
import com.hzausoft.hzauraceinfo.service.GonggaolanService;
import com.hzausoft.hzauraceinfo.utils.PageUtils;
import com.hzausoft.hzauraceinfo.utils.Query;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("gonggaolanService")
public class GonggaolanServiceImpl extends ServiceImpl<GonggaolanDao, GonggaolanEntity> implements GonggaolanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GonggaolanEntity> page = this.selectPage(
                new Query<GonggaolanEntity>(params).getPage(),
                new EntityWrapper<GonggaolanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GonggaolanEntity> wrapper) {
		  Page<GonggaolanView> page =new Query<GonggaolanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GonggaolanVO> selectListVO(Wrapper<GonggaolanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GonggaolanVO selectVO(Wrapper<GonggaolanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GonggaolanView> selectListView(Wrapper<GonggaolanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GonggaolanView selectView(Wrapper<GonggaolanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
