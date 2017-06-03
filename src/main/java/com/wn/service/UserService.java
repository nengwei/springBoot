package com.wn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wn.mapper.UserMapper;
import com.wn.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public User getUserInfo(){
		return userMapper.findUserInfo();
	}

}
