package org.example;

public class LoggerAdapter implements Logger {

    org.apache.logging.log4j.Logger logger;// this is the adaptee

    public LoggerAdapter(org.apache.logging.log4j.Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        if (logLevel == LogLevel.INFO) {
            logger.info(message);
        } else if (logLevel == LogLevel.DEBUG) {
            logger.debug(message);
        } else if (logLevel == LogLevel.ERROR) {
            logger.error(message);
        } else if (logLevel == LogLevel.WARNING) {
            logger.warn(message);
        } else if (logLevel == LogLevel.FATAL) {
            logger.fatal(message);
        } else if (logLevel == LogLevel.TRACE) {
            logger.trace(message);
        }
    }
}
