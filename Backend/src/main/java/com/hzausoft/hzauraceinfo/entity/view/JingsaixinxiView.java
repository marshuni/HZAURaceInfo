package com.hzausoft.hzauraceinfo.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.hzausoft.hzauraceinfo.entity.JingsaixinxiEntity;

import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
 

/**
 * 竞赛信息
 */
@TableName("jingsaixinxi")
public class JingsaixinxiView  extends JingsaixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingsaixinxiView(){
	}
 
 	public JingsaixinxiView(JingsaixinxiEntity jingsaixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jingsaixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
