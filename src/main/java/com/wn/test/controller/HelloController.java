package com.wn.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author neng.wei
 *
 */
@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(){
		return "Hello Wrld";
	}

}
