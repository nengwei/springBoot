package com.wn.controller;

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
public class UserJSONController {
	 private Logger logger = Logger.getLogger(UserJSONController.class);
	 
	    @Autowired
	    private UserService userService;
	 
	    /*
	     *  http://localhost:8080/getUserInfo
	     */
	 
	    @RequestMapping("/getUserInfo")
	    @ResponseBody
	    public User getUserInfo() {
	        User user = userService.getUserInfo();
	        if(user!=null){
	            System.out.println("user.getName():"+user.getName());
	            logger.info("user.getAge():"+user.getAge());
	        }
	        return user;
	    }
}
