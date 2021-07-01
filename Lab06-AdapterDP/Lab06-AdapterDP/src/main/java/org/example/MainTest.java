package org.example;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;

import java.util.function.BiConsumer;

/**
 * Hello world!
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        BiConsumer<LogLevel, String> logFormatter = (l, s) -> System.out.printf("[ %s ] %s\n", l, s);
        logFormatter.accept(LogLevel.ERROR, "Testing with Lambad 8");

        // our logger implementation
        Logger logger = new LoggerUtil();
        logger.log(LogLevel.ERROR, "test log...");

        // log4j implementation
        org.apache.logging.log4j.Logger log4j = LogManager.getLogger();//LogManager.getLogger();
        log4j.log(Level.ERROR, "testing log4j...");

        // converting log4j with our interface
        Logger loggerAdapter = new LoggerAdapter(log4j);
        loggerAdapter.log(LogLevel.ERROR, "test log adapter...");
    }
}
