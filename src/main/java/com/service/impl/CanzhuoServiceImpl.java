package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CanzhuoDao;
import com.entity.CanzhuoEntity;
import com.service.CanzhuoService;
import com.entity.vo.CanzhuoVO;
import com.entity.view.CanzhuoView;

@Service("canzhuoService")
public class CanzhuoServiceImpl extends ServiceImpl<CanzhuoDao, CanzhuoEntity> implements CanzhuoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CanzhuoEntity> page = this.selectPage(
                new Query<CanzhuoEntity>(params).getPage(),
                new EntityWrapper<CanzhuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CanzhuoEntity> wrapper) {
		  Page<CanzhuoView> page =new Query<CanzhuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CanzhuoVO> selectListVO(Wrapper<CanzhuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CanzhuoVO selectVO(Wrapper<CanzhuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CanzhuoView> selectListView(Wrapper<CanzhuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CanzhuoView selectView(Wrapper<CanzhuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
