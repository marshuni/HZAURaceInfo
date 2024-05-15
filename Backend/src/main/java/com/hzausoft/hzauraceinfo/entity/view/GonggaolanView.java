package com.hzausoft.hzauraceinfo.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.hzausoft.hzauraceinfo.entity.GonggaolanEntity;

import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
 

/**
 * 公告栏
 */
@TableName("gonggaolan")
public class GonggaolanView  extends GonggaolanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GonggaolanView(){
	}
 
 	public GonggaolanView(GonggaolanEntity gonggaolanEntity){
 	try {
			BeanUtils.copyProperties(this, gonggaolanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
