package com.goddice.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.goddice.dal.dao.tSysTesthxlMapper;
import com.goddice.model.tSysTesthxl;
import com.goddice.model.tSysTesthxlExample;
import com.goddice.service.ITestService;

@Service("userService")
public class TestServiceImpl implements ITestService {
	@Resource
	private tSysTesthxlMapper testDao;

	@Override
	public List<tSysTesthxl> getTestById() {
		// TODO Auto-generated method stub
		tSysTesthxlExample example = new tSysTesthxlExample();
		example.createCriteria().andNameEqualTo("hu");
		return this.testDao.selectByExample(example);

	}

}
