package com.entity.view;

import com.entity.DiscusscaipinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 菜品信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-20 21:35:41
 */
@TableName("discusscaipinxinxi")
public class DiscusscaipinxinxiView  extends DiscusscaipinxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusscaipinxinxiView(){
	}
 
 	public DiscusscaipinxinxiView(DiscusscaipinxinxiEntity discusscaipinxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusscaipinxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
