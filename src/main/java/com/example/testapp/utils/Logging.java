package com.example.testapp.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class Logging {
    public static final Logger logger = LogManager.getLogger(Logging.class.getName());
//    private static Logging instance = null;
//
//    private Logging() {}
//
//    public static Logging getInstance() {
//        if (instance == null) {
//            instance = new Logging();
//        }
//        return instance;
//    }

    public void loggerInfo(Object logs) {
        logger.info(logs);
    }

    public void loggerError(Object logs) {
        logger.error(logs);
    }
}
