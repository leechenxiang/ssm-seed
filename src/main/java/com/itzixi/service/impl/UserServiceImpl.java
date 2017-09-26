package com.itzixi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itzixi.mapper.SysUserMapper;
import com.itzixi.pojo.SysUser;
import com.itzixi.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private SysUserMapper userMapper;

	public void saveUser(SysUser user) {
		
	}

}
