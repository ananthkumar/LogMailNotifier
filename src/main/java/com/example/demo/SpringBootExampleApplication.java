package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}
	
	
	

	/*@PostConstruct
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
		PatternLayout pl = new PatternLayout();
		pl.setConversionPattern("%-7p %d [%t] %c %x - %m%n");
		appender.setLayout(pl);
		
		appender.activateOptions();
	    Logger.getRootLogger().addAppender(appender);
		System.out.println("++++++++++++>>>>>>>>>>======================<<<<<<<<<<++++++++==");

	}
*/	
}
