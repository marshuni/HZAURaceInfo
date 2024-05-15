package com.hzausoft.hzauraceinfo.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hzausoft.hzauraceinfo.dao.JingsaifenleiDao;
import com.hzausoft.hzauraceinfo.entity.JingsaifenleiEntity;
import com.hzausoft.hzauraceinfo.entity.view.JingsaifenleiView;
import com.hzausoft.hzauraceinfo.entity.vo.JingsaifenleiVO;
import com.hzausoft.hzauraceinfo.service.JingsaifenleiService;
import com.hzausoft.hzauraceinfo.utils.PageUtils;
import com.hzausoft.hzauraceinfo.utils.Query;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("jingsaifenleiService")
public class JingsaifenleiServiceImpl extends ServiceImpl<JingsaifenleiDao, JingsaifenleiEntity> implements JingsaifenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingsaifenleiEntity> page = this.selectPage(
                new Query<JingsaifenleiEntity>(params).getPage(),
                new EntityWrapper<JingsaifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingsaifenleiEntity> wrapper) {
		  Page<JingsaifenleiView> page =new Query<JingsaifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingsaifenleiVO> selectListVO(Wrapper<JingsaifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingsaifenleiVO selectVO(Wrapper<JingsaifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingsaifenleiView> selectListView(Wrapper<JingsaifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingsaifenleiView selectView(Wrapper<JingsaifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
