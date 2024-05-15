package com.hzausoft.hzauraceinfo.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hzausoft.hzauraceinfo.dao.JingsaixinxiDao;
import com.hzausoft.hzauraceinfo.entity.JingsaixinxiEntity;
import com.hzausoft.hzauraceinfo.entity.view.JingsaixinxiView;
import com.hzausoft.hzauraceinfo.entity.vo.JingsaixinxiVO;
import com.hzausoft.hzauraceinfo.service.JingsaixinxiService;
import com.hzausoft.hzauraceinfo.utils.PageUtils;
import com.hzausoft.hzauraceinfo.utils.Query;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("jingsaixinxiService")
public class JingsaixinxiServiceImpl extends ServiceImpl<JingsaixinxiDao, JingsaixinxiEntity> implements JingsaixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingsaixinxiEntity> page = this.selectPage(
                new Query<JingsaixinxiEntity>(params).getPage(),
                new EntityWrapper<JingsaixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingsaixinxiEntity> wrapper) {
		  Page<JingsaixinxiView> page =new Query<JingsaixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingsaixinxiVO> selectListVO(Wrapper<JingsaixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingsaixinxiVO selectVO(Wrapper<JingsaixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingsaixinxiView> selectListView(Wrapper<JingsaixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingsaixinxiView selectView(Wrapper<JingsaixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
