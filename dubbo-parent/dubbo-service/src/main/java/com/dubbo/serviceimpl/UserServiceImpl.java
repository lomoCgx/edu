package com.dubbo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dubbo.mapper.DubboUserMapper;

import api.entity.DubboUser;
import api.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private DubboUserMapper userMapper;
	
	@Override
	public DubboUser selectByPrimaryKey(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}

}
