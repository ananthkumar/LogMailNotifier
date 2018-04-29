package com.example.main;

import org.apache.log4j.Logger;

public class MailNotifier {
	 
	private static Logger logger = Logger.getLogger(MailNotifier.class);

	public static void main(String[] args) {
		try {
			// Generating Sample Exception
			throw new Exception("MailNotifier :: Generating Exception To Test Log4j Mail Notification...");
		} catch (Exception exObj) {
			logger.error("Sample Result?= " + exObj);
		}
	}
}
