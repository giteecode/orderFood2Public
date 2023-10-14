package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusscaipinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusscaipinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusscaipinxinxiView;


/**
 * 菜品信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-20 21:35:41
 */
public interface DiscusscaipinxinxiService extends IService<DiscusscaipinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusscaipinxinxiVO> selectListVO(Wrapper<DiscusscaipinxinxiEntity> wrapper);
   	
   	DiscusscaipinxinxiVO selectVO(@Param("ew") Wrapper<DiscusscaipinxinxiEntity> wrapper);
   	
   	List<DiscusscaipinxinxiView> selectListView(Wrapper<DiscusscaipinxinxiEntity> wrapper);
   	
   	DiscusscaipinxinxiView selectView(@Param("ew") Wrapper<DiscusscaipinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusscaipinxinxiEntity> wrapper);
   	
}

