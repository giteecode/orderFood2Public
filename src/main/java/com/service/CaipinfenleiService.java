package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaipinfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaipinfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaipinfenleiView;


/**
 * 菜品分类
 *
 * @author 
 * @email 
 * @date 2021-03-20 21:35:40
 */
public interface CaipinfenleiService extends IService<CaipinfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaipinfenleiVO> selectListVO(Wrapper<CaipinfenleiEntity> wrapper);
   	
   	CaipinfenleiVO selectVO(@Param("ew") Wrapper<CaipinfenleiEntity> wrapper);
   	
   	List<CaipinfenleiView> selectListView(Wrapper<CaipinfenleiEntity> wrapper);
   	
   	CaipinfenleiView selectView(@Param("ew") Wrapper<CaipinfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaipinfenleiEntity> wrapper);
   	
}

