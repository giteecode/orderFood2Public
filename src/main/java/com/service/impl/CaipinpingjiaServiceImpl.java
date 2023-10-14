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


import com.dao.CaipinpingjiaDao;
import com.entity.CaipinpingjiaEntity;
import com.service.CaipinpingjiaService;
import com.entity.vo.CaipinpingjiaVO;
import com.entity.view.CaipinpingjiaView;

@Service("caipinpingjiaService")
public class CaipinpingjiaServiceImpl extends ServiceImpl<CaipinpingjiaDao, CaipinpingjiaEntity> implements CaipinpingjiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaipinpingjiaEntity> page = this.selectPage(
                new Query<CaipinpingjiaEntity>(params).getPage(),
                new EntityWrapper<CaipinpingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaipinpingjiaEntity> wrapper) {
		  Page<CaipinpingjiaView> page =new Query<CaipinpingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaipinpingjiaVO> selectListVO(Wrapper<CaipinpingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaipinpingjiaVO selectVO(Wrapper<CaipinpingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaipinpingjiaView> selectListView(Wrapper<CaipinpingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaipinpingjiaView selectView(Wrapper<CaipinpingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
