package com.entity.view;

import com.entity.CaipinpingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 菜品评价
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-20 21:35:40
 */
@TableName("caipinpingjia")
public class CaipinpingjiaView  extends CaipinpingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CaipinpingjiaView(){
	}
 
 	public CaipinpingjiaView(CaipinpingjiaEntity caipinpingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, caipinpingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
