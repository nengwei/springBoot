package com.wn.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wn.model.User;
import com.wn.service.UserService;

/**
 * json格式
 * 
 * @author weineng
 *
 */
@Controller
@RequestMapping("user")
public class UserJSONController {
	 private Logger logger = Logger.getLogger(UserJSONController.class);
	 
	    @Autowired
	    private UserService userService;
	 
	    /*
	     *  http://localhost:8080/getUserInfo
	     */
	 
	    @RequestMapping("/getUserInfo")
	    @ResponseBody
	    public Map<String,Object> getUserInfo(String name,Integer pageNumber,Integer pageSize) {
	    	System.out.println(pageNumber);
	    	System.out.println(name);
	    	System.out.println("------------->" + pageSize);
	    	Map<String,Object> resultMap = new HashMap<String,Object>();
	        List<User> user = userService.getUserInfo();
	        resultMap.put("rows", user);
	        resultMap.put("total",user.size());
	        System.out.println(user.get(0).getName());
	        return  resultMap;
	    }
	    
	    
}
