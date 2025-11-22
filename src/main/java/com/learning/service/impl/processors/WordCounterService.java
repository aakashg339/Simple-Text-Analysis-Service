package com.learning.service.impl.processors;

import org.springframework.stereotype.Component;

import com.learning.service.TextProcessor;

@Component("WordCounterService")
public class WordCounterService implements TextProcessor{
    @Override
    public int process(String text) {
        int i, n, count;

        n = text.length();
        count = 0;

        for(i=0; i<text.length(); i++) {
            if(text.charAt(i) != ' ') {
                count++;
                
                for(; i<n && text.charAt(i) != ' '; i++);
                i--;
            }
        }
        
        return count;
    }
}
