package com.wn.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wn.common.BaseMapper;
import com.wn.model.User;
/**
 * 
 * @author weineng
 *
 */

public interface UserMapper extends BaseMapper<User>{
	
	public List<User> findUserInfo();

}
