package com.hzausoft.hzauraceinfo.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hzausoft.hzauraceinfo.dao.DiscussjingsaixinxiDao;
import com.hzausoft.hzauraceinfo.entity.DiscussjingsaixinxiEntity;
import com.hzausoft.hzauraceinfo.entity.view.DiscussjingsaixinxiView;
import com.hzausoft.hzauraceinfo.entity.vo.DiscussjingsaixinxiVO;
import com.hzausoft.hzauraceinfo.service.DiscussjingsaixinxiService;
import com.hzausoft.hzauraceinfo.utils.PageUtils;
import com.hzausoft.hzauraceinfo.utils.Query;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("discussjingsaixinxiService")
public class DiscussjingsaixinxiServiceImpl extends ServiceImpl<DiscussjingsaixinxiDao, DiscussjingsaixinxiEntity> implements DiscussjingsaixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjingsaixinxiEntity> page = this.selectPage(
                new Query<DiscussjingsaixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussjingsaixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjingsaixinxiEntity> wrapper) {
		  Page<DiscussjingsaixinxiView> page =new Query<DiscussjingsaixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjingsaixinxiVO> selectListVO(Wrapper<DiscussjingsaixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjingsaixinxiVO selectVO(Wrapper<DiscussjingsaixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjingsaixinxiView> selectListView(Wrapper<DiscussjingsaixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjingsaixinxiView selectView(Wrapper<DiscussjingsaixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
