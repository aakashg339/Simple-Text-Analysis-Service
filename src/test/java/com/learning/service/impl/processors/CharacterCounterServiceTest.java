package com.learning.service.impl.processors;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CharacterCounterServiceTest {
    private CharacterCounterService characterCounterService;
    
    @BeforeEach
    public void setUp() {
        characterCounterService = new CharacterCounterService();
    }

    @Test
    public void testProcessWithNoBeginningOrTrailingSpaces() {
        String testString = "A simple text";
        assertEquals(testString.length(), characterCounterService.process(testString));
    }

    @Test
    public void testProcessWithBeginningOrTrailingSpaces() {
        String testString = "   A simple text   . ";
        assertEquals(testString.length(), characterCounterService.process(testString));
    }

    @Test
    public void testProcessWithSingleWord() {
        String testString = "Simple";
        assertEquals(testString.length(), characterCounterService.process(testString));
    }
}
