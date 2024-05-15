package com.hzausoft.hzauraceinfo.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hzausoft.hzauraceinfo.dao.DiscussgonggaolanDao;
import com.hzausoft.hzauraceinfo.entity.DiscussgonggaolanEntity;
import com.hzausoft.hzauraceinfo.entity.view.DiscussgonggaolanView;
import com.hzausoft.hzauraceinfo.entity.vo.DiscussgonggaolanVO;
import com.hzausoft.hzauraceinfo.service.DiscussgonggaolanService;
import com.hzausoft.hzauraceinfo.utils.PageUtils;
import com.hzausoft.hzauraceinfo.utils.Query;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("discussgonggaolanService")
public class DiscussgonggaolanServiceImpl extends ServiceImpl<DiscussgonggaolanDao, DiscussgonggaolanEntity> implements DiscussgonggaolanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussgonggaolanEntity> page = this.selectPage(
                new Query<DiscussgonggaolanEntity>(params).getPage(),
                new EntityWrapper<DiscussgonggaolanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussgonggaolanEntity> wrapper) {
		  Page<DiscussgonggaolanView> page =new Query<DiscussgonggaolanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussgonggaolanVO> selectListVO(Wrapper<DiscussgonggaolanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussgonggaolanVO selectVO(Wrapper<DiscussgonggaolanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussgonggaolanView> selectListView(Wrapper<DiscussgonggaolanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussgonggaolanView selectView(Wrapper<DiscussgonggaolanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
