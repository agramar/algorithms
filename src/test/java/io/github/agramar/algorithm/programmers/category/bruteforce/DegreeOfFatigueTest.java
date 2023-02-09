package io.github.agramar.algorithm.programmers.category.bruteforce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DegreeOfFatigueTest {

    DegreeOfFatigue degreeOfFatigue = new DegreeOfFatigue();

    @Test
    void case1() {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        int result = degreeOfFatigue.solution(k, dungeons);
        assertEquals(3, result);
    }
}