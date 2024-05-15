package com.hzausoft.hzauraceinfo.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.hzausoft.hzauraceinfo.entity.JingsaifenleiEntity;

import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
 

/**
 * 竞赛分类
 */
@TableName("jingsaifenlei")
public class JingsaifenleiView  extends JingsaifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingsaifenleiView(){
	}
 
 	public JingsaifenleiView(JingsaifenleiEntity jingsaifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, jingsaifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
