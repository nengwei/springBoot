package com.wn.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.wn.model.User;
import com.wn.service.UserService;
import com.wn.util.ExcelUtil;

/**
 * 视图模版
 * 
 * @author neng.wei
 *
 */
@Controller
@EnableAutoConfiguration
public class HelloController {

	private Logger logger = Logger.getLogger(HelloController.class);
	
	@Autowired
    private UserService userService;

	/*
	 * http://localhost:8080/hello?name=cn.7player
	 */

	@RequestMapping("/hello")
	public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {
		logger.info("hello");
		model.addAttribute("name", name);
		return "hello";
	}

	/**
	 * http://localhost:8080/echarts
	 * 
	 * @return
	 */
	@RequestMapping("/echarts")
	public String echarts() {
		return "echarts";
	}
	
	/**
	 * poi   excel导出
	 */
	@RequestMapping(value = "/excelExport")
	@ResponseBody
	public void excelExport(HttpServletRequest request,HttpServletResponse response){
		List<User>  users =  userService.getUserInfo();
		String title = "demo";
		ExcelUtil.downloadExcelFile(title,JSON.toJSONString(users),response);
	}

}
