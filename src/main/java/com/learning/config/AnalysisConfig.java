package com.learning.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.learning")
public class AnalysisConfig {

    private String testProperty;

    public AnalysisConfig(@Value("aDefaultValue") String testProperty) {
        this.testProperty = testProperty;

        System.out.println("Injected testProperty value: " + this.testProperty);
    }

}
