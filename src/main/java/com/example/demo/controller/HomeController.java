package com.example.demo.controller;

import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class HomeController {
	private static Logger logger = Logger.getLogger(HomeController.class);
	private static Logger l = Logger.getLogger(HomeController.class);
	//org.apache.log4j.Logger l = org.apache.log4j.Logger.getLogger(HomeController.class);

    @RequestMapping("/home")  
    public String home(){    	
    	try {
    		//FileAppender fileappender = new FileAppender(new HTMLLayout(),"HTMLFile.html");
	    	//	l.addAppender(fileappender);
	    		l.info("Welcome");
	    		l.info("to");
	    		l.info("India");
	    		l.info("-----------");
            // Generate exception
            throw new Exception("SpringBootExample :: Generating exception to test Log4j mail notification...");
            
        } catch (Exception ex) {
        	//logger.error("Test Result : ", ex);
        	logger.error("Test Result : ", ex);
        	
        }
        return"Home!";  
    }
}  