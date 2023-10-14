package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CanzhuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CanzhuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CanzhuoView;


/**
 * 餐桌
 *
 * @author 
 * @email 
 * @date 2021-03-20 21:35:40
 */
public interface CanzhuoService extends IService<CanzhuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CanzhuoVO> selectListVO(Wrapper<CanzhuoEntity> wrapper);
   	
   	CanzhuoVO selectVO(@Param("ew") Wrapper<CanzhuoEntity> wrapper);
   	
   	List<CanzhuoView> selectListView(Wrapper<CanzhuoEntity> wrapper);
   	
   	CanzhuoView selectView(@Param("ew") Wrapper<CanzhuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CanzhuoEntity> wrapper);
   	
}

