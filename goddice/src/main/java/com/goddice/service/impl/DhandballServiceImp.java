package com.goddice.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.goddice.dal.dao.BcDhandballMapper;
import com.goddice.model.BcDhandball;
import com.goddice.service.IDhandballService;
@Service("dhandService")
public class DhandballServiceImp implements IDhandballService {
	@Resource
	BcDhandballMapper bcDhandballMapper;
	@Override
	public List<BcDhandball> queryDhand(Integer page, Integer size) {
		// TODO Auto-generated method stub
		int begin=(page-1)*size;
		List<BcDhandball> result=bcDhandballMapper.queryListPage(begin, size);
		return result;
	}

}
