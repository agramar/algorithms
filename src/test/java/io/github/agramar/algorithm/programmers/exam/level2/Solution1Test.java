package io.github.agramar.algorithm.programmers.exam.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1Test {

    Solution1 solution = new Solution1();

    @Test
    void case1() {
        String input = "aabbaccc";
        int actual = solution.solution(input);
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void case2() {
        String input = "ababcdcdababcdcd";
        int actual = solution.solution(input);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void case3() {
        String input = "abcabcdede";
        int actual = solution.solution(input);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void case4() {
        String input = "abcabcabcabcdededededede";
        int actual = solution.solution(input);
        int expected = 14;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void case5() {
        String input = "xababcdcdababcdcd";
        int actual = solution.solution(input);
        int expected = 17;
        Assertions.assertEquals(expected, actual);
    }
}