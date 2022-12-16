package io.github.agramar.algorithm.programmers.category.stackqueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CorrectBracketTest {

    CorrectBracket correctBracket;

    @BeforeEach
    void setUp() {
        correctBracket = new CorrectBracket();
    }

    @Test
    void testCase1() {
        String s = "()()";
        boolean answer = correctBracket.solution(s);
        assertTrue(answer);
    }

    @Test
    void testCase2() {
        String s = "(())()";
        boolean answer = correctBracket.solution(s);
        assertTrue(answer);
    }

    @Test
    void testCase3() {
        String s = ")()(";
        boolean answer = correctBracket.solution(s);
        assertFalse(answer);
    }

    @Test
    void testCase4() {
        String s = "(()(";
        boolean answer = correctBracket.solution(s);
        assertFalse(answer);
    }
}