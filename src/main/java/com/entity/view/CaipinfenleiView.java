package com.entity.view;

import com.entity.CaipinfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 菜品分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-20 21:35:40
 */
@TableName("caipinfenlei")
public class CaipinfenleiView  extends CaipinfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CaipinfenleiView(){
	}
 
 	public CaipinfenleiView(CaipinfenleiEntity caipinfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, caipinfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
