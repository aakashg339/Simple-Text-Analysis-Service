package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.config.AnalysisConfig;
import com.learning.service.AnalysisClient;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AnalysisConfig.class);
        
        AnalysisClient client = context.getBean("textAnalysisClient", AnalysisClient.class);

        client.analyzeText("Sample text for analysis.");
    }
}
