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


import com.dao.CaipinxinxiDao;
import com.entity.CaipinxinxiEntity;
import com.service.CaipinxinxiService;
import com.entity.vo.CaipinxinxiVO;
import com.entity.view.CaipinxinxiView;

@Service("caipinxinxiService")
public class CaipinxinxiServiceImpl extends ServiceImpl<CaipinxinxiDao, CaipinxinxiEntity> implements CaipinxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaipinxinxiEntity> page = this.selectPage(
                new Query<CaipinxinxiEntity>(params).getPage(),
                new EntityWrapper<CaipinxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaipinxinxiEntity> wrapper) {
		  Page<CaipinxinxiView> page =new Query<CaipinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaipinxinxiVO> selectListVO(Wrapper<CaipinxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaipinxinxiVO selectVO(Wrapper<CaipinxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaipinxinxiView> selectListView(Wrapper<CaipinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaipinxinxiView selectView(Wrapper<CaipinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
