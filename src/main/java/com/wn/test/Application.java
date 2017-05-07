package com.wn.test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * springBoot启动程序
 * @author neng.wei
 *
 */
@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String greeting() {
        return "Hello World!";
    }
    
    

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
};