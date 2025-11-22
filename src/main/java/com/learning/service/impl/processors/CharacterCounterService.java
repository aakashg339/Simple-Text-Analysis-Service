package com.learning.service.impl.processors;

import org.springframework.stereotype.Component;

import com.learning.service.TextProcessor;

@Component("CharacterCounterService")
public class CharacterCounterService implements TextProcessor{

    @Override
    public int process(String text) {
        return text.length();
    }

}
