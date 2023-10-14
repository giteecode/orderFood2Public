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


import com.dao.CaipinfenleiDao;
import com.entity.CaipinfenleiEntity;
import com.service.CaipinfenleiService;
import com.entity.vo.CaipinfenleiVO;
import com.entity.view.CaipinfenleiView;

@Service("caipinfenleiService")
public class CaipinfenleiServiceImpl extends ServiceImpl<CaipinfenleiDao, CaipinfenleiEntity> implements CaipinfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaipinfenleiEntity> page = this.selectPage(
                new Query<CaipinfenleiEntity>(params).getPage(),
                new EntityWrapper<CaipinfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaipinfenleiEntity> wrapper) {
		  Page<CaipinfenleiView> page =new Query<CaipinfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaipinfenleiVO> selectListVO(Wrapper<CaipinfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaipinfenleiVO selectVO(Wrapper<CaipinfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaipinfenleiView> selectListView(Wrapper<CaipinfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaipinfenleiView selectView(Wrapper<CaipinfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
