package com.goddice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goddice.dal.dao.Sys3DStandardMapper;
import com.goddice.model.Sys3DStandard;
import com.goddice.service.IThreedService;
@Service
public class ThreedServiceImpl implements IThreedService {
	@Autowired
	private Sys3DStandardMapper sys3DStandardMapper;
	

	@Override
	public void addBatch(Sys3DStandard Standard) {
		// TODO Auto-generated method stub
		sys3DStandardMapper.insertSelective(Standard);

	}

}
