package com.example.demo.components;

import java.net.UnknownHostException;

import javax.annotation.PostConstruct;

import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.net.SMTPAppender;
import org.springframework.stereotype.Component;



@Component
public class Log4jMailer {
	
	@PostConstruct
	public void init() throws UnknownHostException{
		SMTPAppender appender = new SMTPAppender();
		System.out.println("++++++++++++>>>>>>>>>>======================<<<<<<<<<<++++++++==");
		//<-- Email Configuration -->
		appender.setBufferSize(512);
		appender.setSMTPHost("smtp.gmail.com");
		appender.setSMTPProtocol("smtps");
		appender.setSMTPPort(465);
		appender.setSMTPUsername("sananth949494@gmail.com");
		appender.setSMTPPassword("nov15nov");
		appender.setFrom("sananth949494@gmail.com");
		appender.setTo("sananth949494@gmail.com");
		appender.setSubject("Testing Log4j Mail Notification");
		appender.setThreshold(Level.ERROR);
		//PatternLayout pl = new PatternLayout("%-7p %d [%t] %c %x - %m%n");
		//PatternLayout pl = new PatternLayout();
		//pl.setConversionPattern("%-7p %d [%t] %c %x - %m%n");
		//appender.setLayout(pl);
		
		HTMLLayout hl = new HTMLLayout();		
		appender.setLayout(hl);		
		appender.activateOptions();
	
	    Logger.getRootLogger().addAppender(appender);
	    
	  
		System.out.println("++++++++++++>>>>>>>>>>======================<<<<<<<<<<++++++++==");
	}


}
