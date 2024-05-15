
package com.hzausoft.hzauraceinfo.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.hzausoft.hzauraceinfo.entity.ConfigEntity;
import com.hzausoft.hzauraceinfo.utils.PageUtils;

import java.util.Map;


/**
 * 系统用户
 */
public interface ConfigService extends IService<ConfigEntity> {
	PageUtils queryPage(Map<String, Object> params,Wrapper<ConfigEntity> wrapper);
}
