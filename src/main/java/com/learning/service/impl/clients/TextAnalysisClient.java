package com.learning.service.impl.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.learning.service.AnalysisClient;
import com.learning.service.TextProcessor;

@Component
public class TextAnalysisClient implements AnalysisClient {

    TextProcessor textProcessor;

    @Autowired
    public TextAnalysisClient(@Qualifier("WordCounterService") TextProcessor textProcessor) {
        this.textProcessor = textProcessor;
    }

    @Override
    public void analyzeText(String text) {
        System.out.println("Result of the analysis - " + textProcessor.process(text));
    }
}
