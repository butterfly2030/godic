package com.goddice.service;

import java.util.List;

import com.goddice.model.BcDhandball;

public interface IDhandballService {
	public List<BcDhandball> queryDhand(Integer page,Integer size);

}
