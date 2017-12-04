package com.dubbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import api.entity.DubboUser;
import api.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/{id}")
	@ResponseBody
	public DubboUser queryById(@PathVariable("id") Long id) {
		
		DubboUser user = userService.selectByPrimaryKey(id);
		
		return user;
	}
	
}
