package com.epam.alltogether;
import java.util.logging.Logger;

public class LoggerFactory {
    private static Logger mocklogger;
    
    public static void setMockLogger(final Logger mocklogger){
        LoggerFactory.mocklogger = mocklogger;
    }
    
    public static <T> Logger getLogger(final Class<T> clazz){
        Logger result;
        if(mocklogger != null){
            result = mocklogger;
        } else{
            result = Logger.getLogger(clazz.getName());
        } return result;
    }
    
}
