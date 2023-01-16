package io.github.agramar.algorithm.programmers.category.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberTest {

    MaximumNumber maximumNumber = new MaximumNumber();

    @Test
    void case1() {
        String number = "1924";
        int k = 2;
        String result = maximumNumber.solution(number, k);
        assertEquals("94", result);
    }

    @Test
    void case2() {
        String number = "1231234";
        int k = 3;
        String result = maximumNumber.solution(number, k);
        assertEquals("3234", result);
    }

    @Test
    void case3() {
        String number = "4177252841";
        int k = 4;
        String result = maximumNumber.solution(number, k);
        assertEquals("775841", result);
    }

    @Test
    void case4() {
        String number = "999";
        int k = 2;
        String result = maximumNumber.solution(number, k);
        assertEquals("9", result);
    }

    @Test
    void case5() {
        String number = "111119";
        int k = 3;
        String result = maximumNumber.solution(number, k);
        assertEquals("119", result);
    }
}