package org.example;

public class LoggerUtil implements Logger {
    @Override
    public void log(LogLevel logLevel, String message) {
        System.out.printf("[ %s ] %s\n", logLevel, message);
    }
}
