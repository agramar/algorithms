package io.github.agramar.algorithm.programmers.category.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NExpressionTest {

    NExpression nExpression = new NExpression();

    @Test
    void case1() {
        int N = 5;
        int number = 12;
        int result = nExpression.solution(N, number);
        assertEquals(4, result);
    }

    @Test
    void case2() {
        int N = 2;
        int number = 11;
        int result = nExpression.solution(N, number);
        assertEquals(3, result);
    }
}