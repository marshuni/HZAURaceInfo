package com.hzausoft.hzauraceinfo.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hzausoft.hzauraceinfo.dao.StoreupDao;
import com.hzausoft.hzauraceinfo.entity.StoreupEntity;
import com.hzausoft.hzauraceinfo.entity.view.StoreupView;
import com.hzausoft.hzauraceinfo.entity.vo.StoreupVO;
import com.hzausoft.hzauraceinfo.service.StoreupService;
import com.hzausoft.hzauraceinfo.utils.PageUtils;
import com.hzausoft.hzauraceinfo.utils.Query;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("storeupService")
public class StoreupServiceImpl extends ServiceImpl<StoreupDao, StoreupEntity> implements StoreupService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<StoreupEntity> page = this.selectPage(
                new Query<StoreupEntity>(params).getPage(),
                new EntityWrapper<StoreupEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<StoreupEntity> wrapper) {
		  Page<StoreupView> page =new Query<StoreupView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<StoreupVO> selectListVO(Wrapper<StoreupEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public StoreupVO selectVO(Wrapper<StoreupEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<StoreupView> selectListView(Wrapper<StoreupEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public StoreupView selectView(Wrapper<StoreupEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
