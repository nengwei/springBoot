package com.wn.controller;

import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *  视图模版
 * @author neng.wei
 *
 */
@Controller
@EnableAutoConfiguration
public class HelloController {
	
	private Logger logger = Logger.getLogger(HelloController.class);
	 
    /*
    *   http://localhost:8080/hello?name=cn.7player
     */
 
    @RequestMapping("/hello")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        logger.info("hello");
        model.addAttribute("name", name);
        return "hello";
    }

}
