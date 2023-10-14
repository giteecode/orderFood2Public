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


import com.dao.DiscusscaipinxinxiDao;
import com.entity.DiscusscaipinxinxiEntity;
import com.service.DiscusscaipinxinxiService;
import com.entity.vo.DiscusscaipinxinxiVO;
import com.entity.view.DiscusscaipinxinxiView;

@Service("discusscaipinxinxiService")
public class DiscusscaipinxinxiServiceImpl extends ServiceImpl<DiscusscaipinxinxiDao, DiscusscaipinxinxiEntity> implements DiscusscaipinxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusscaipinxinxiEntity> page = this.selectPage(
                new Query<DiscusscaipinxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusscaipinxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusscaipinxinxiEntity> wrapper) {
		  Page<DiscusscaipinxinxiView> page =new Query<DiscusscaipinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusscaipinxinxiVO> selectListVO(Wrapper<DiscusscaipinxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusscaipinxinxiVO selectVO(Wrapper<DiscusscaipinxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusscaipinxinxiView> selectListView(Wrapper<DiscusscaipinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusscaipinxinxiView selectView(Wrapper<DiscusscaipinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
