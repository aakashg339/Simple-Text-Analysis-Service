package com.learning.service.impl.processors;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WordCounterServiceTest {
    private WordCounterService wordCounterService;

    @BeforeEach
    public void setUp() {
        wordCounterService = new WordCounterService();
    }

    @Test
    public void testProcessWithNoBeginningOrTrailingSpaces() {
        assertEquals(3, wordCounterService.process("A simple text"));
    }

    @Test
    public void testProcessWithBeginningOrTrailingSpaces() {
        assertEquals(4, wordCounterService.process("   A simple text   . "));
    }

    @Test
    public void testProcessWithSingleWord() {
        assertEquals(1, wordCounterService.process("Simple"));
    }
}
