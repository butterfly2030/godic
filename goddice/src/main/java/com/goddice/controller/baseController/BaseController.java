package com.goddice.controller.baseController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.goddice.model.BcDhandball;
import com.goddice.model.tSysTesthxl;
import com.goddice.service.IDhandballService;
import com.goddice.service.ITestService;

@Controller  
public class BaseController {
	   @Autowired  
	   private ITestService testService;  
	   @Autowired
	   private IDhandballService dhandballService;

	 @RequestMapping(value = "/test",method = RequestMethod.GET)  
	public @ResponseBody String test(){
		 List<tSysTesthxl>  test=testService.getTestById();
		return JSON.toJSONString(test);
	}
	 
	 @RequestMapping(value = "/queryDhandball",method = RequestMethod.GET)  
	public @ResponseBody List<BcDhandball> queryDhandball(
			@RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "10") Integer size){
		 List<BcDhandball>  test=dhandballService.queryDhand(page, size);
		return test;
	}


}
