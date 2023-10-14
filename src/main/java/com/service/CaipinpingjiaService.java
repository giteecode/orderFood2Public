package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaipinpingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaipinpingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaipinpingjiaView;


/**
 * 菜品评价
 *
 * @author 
 * @email 
 * @date 2021-03-20 21:35:40
 */
public interface CaipinpingjiaService extends IService<CaipinpingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaipinpingjiaVO> selectListVO(Wrapper<CaipinpingjiaEntity> wrapper);
   	
   	CaipinpingjiaVO selectVO(@Param("ew") Wrapper<CaipinpingjiaEntity> wrapper);
   	
   	List<CaipinpingjiaView> selectListView(Wrapper<CaipinpingjiaEntity> wrapper);
   	
   	CaipinpingjiaView selectView(@Param("ew") Wrapper<CaipinpingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaipinpingjiaEntity> wrapper);
   	
}

