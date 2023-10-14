package com.dao;

import com.entity.CaipinpingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaipinpingjiaVO;
import com.entity.view.CaipinpingjiaView;


/**
 * 菜品评价
 * 
 * @author 
 * @email 
 * @date 2021-03-20 21:35:40
 */
public interface CaipinpingjiaDao extends BaseMapper<CaipinpingjiaEntity> {
	
	List<CaipinpingjiaVO> selectListVO(@Param("ew") Wrapper<CaipinpingjiaEntity> wrapper);
	
	CaipinpingjiaVO selectVO(@Param("ew") Wrapper<CaipinpingjiaEntity> wrapper);
	
	List<CaipinpingjiaView> selectListView(@Param("ew") Wrapper<CaipinpingjiaEntity> wrapper);

	List<CaipinpingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<CaipinpingjiaEntity> wrapper);
	
	CaipinpingjiaView selectView(@Param("ew") Wrapper<CaipinpingjiaEntity> wrapper);
	
}
