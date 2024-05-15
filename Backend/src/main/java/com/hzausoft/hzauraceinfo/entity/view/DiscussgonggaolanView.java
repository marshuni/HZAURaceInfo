package com.hzausoft.hzauraceinfo.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.hzausoft.hzauraceinfo.entity.DiscussgonggaolanEntity;

import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
 

/**
 * 公告栏评论表
 */
@TableName("discussgonggaolan")
public class DiscussgonggaolanView  extends DiscussgonggaolanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussgonggaolanView(){
	}
 
 	public DiscussgonggaolanView(DiscussgonggaolanEntity discussgonggaolanEntity){
 	try {
			BeanUtils.copyProperties(this, discussgonggaolanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
