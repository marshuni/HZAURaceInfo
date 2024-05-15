package com.hzausoft.hzauraceinfo.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.hzausoft.hzauraceinfo.entity.DiscussjingsaixinxiEntity;

import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
 

/**
 * 竞赛信息评论表
 */
@TableName("discussjingsaixinxi")
public class DiscussjingsaixinxiView  extends DiscussjingsaixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjingsaixinxiView(){
	}
 
 	public DiscussjingsaixinxiView(DiscussjingsaixinxiEntity discussjingsaixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussjingsaixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
