package com.hzausoft.hzauraceinfo.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.hzausoft.hzauraceinfo.entity.GuanliyuanEntity;

import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 管理员
 */
@TableName("guanliyuan")
public class GuanliyuanView  extends GuanliyuanEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public GuanliyuanView(){
    }

    public GuanliyuanView(GuanliyuanEntity guanliyuanEntity){
        try {
            BeanUtils.copyProperties(this, guanliyuanEntity);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
