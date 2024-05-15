
package com.hzausoft.hzauraceinfo.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.hzausoft.hzauraceinfo.entity.TokenEntity;
import com.hzausoft.hzauraceinfo.utils.PageUtils;

import java.util.List;
import java.util.Map;


/**
 * token
 */
public interface TokenService extends IService<TokenEntity> {
 	PageUtils queryPage(Map<String, Object> params);
    
   	List<TokenEntity> selectListView(Wrapper<TokenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TokenEntity> wrapper);
	
   	String generateToken(Long userid,String username,String tableName, String role);
   	
   	TokenEntity getTokenEntity(String token);
}
