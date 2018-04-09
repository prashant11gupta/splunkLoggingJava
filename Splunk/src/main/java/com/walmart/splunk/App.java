package com.walmart.splunk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App 
{
	public static void main(String[] args) throws Exception {
        Logger logger = LoggerFactory.getLogger(App.class);
      
        logger.info("Start logging in splunk");
        logger.error("Error found");
   
    }
}
