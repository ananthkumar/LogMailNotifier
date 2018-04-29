package com.example.demo.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class HomeController {
	private static Logger logger = Logger.getLogger(HomeController.class);
	//org.apache.log4j.Logger l = org.apache.log4j.Logger.getLogger(HomeController.class);

    @RequestMapping("/home")  
    public String home(){    	
    	try {
            // Generate exception
            throw new Exception("SpringBootExample :: Generating exception to test Log4j mail notification...");
        } catch (Exception ex) {
        	logger.error("Test Result : ", ex);
        }
        return"Home!";  
    }
}  