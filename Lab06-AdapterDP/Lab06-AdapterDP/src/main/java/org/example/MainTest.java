package org.example;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;

/**
 * Hello world!
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // our logger implementation
        Logger logger = new LoggerUtil();
        logger.log(LogLevel.ERROR, "test log...");

        // log4j implementation
        org.apache.logging.log4j.Logger log4j = LogManager.getLogger(LoggerUtil.class);//LogManager.getLogger();
        log4j.log(Level.ERROR, "testing log4j...");

        // converting log4j with our interface
        Logger loggerAdapter = new LoggerAdapter(log4j);
        loggerAdapter.log(LogLevel.ERROR, "test log adapter...");
    }
}
