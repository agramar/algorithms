package io.github.agramar.algorithm.programmers.category.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SteppingStoneTest {
    SteppingStone steppingStone = new SteppingStone();

    @Test
    void case1() {
        int distance = 25;
        int[] rocks = {2, 14, 11, 21, 17};
        int n = 2;
        int result = steppingStone.solution(distance, rocks, n);
        assertEquals(4, result);
    }

    @Test
    void case2() {
        int distance = 100;
        int[] rocks = {1, 5, 7};
        int n = 2;
        int result = steppingStone.solution(distance, rocks, n);
        assertEquals(7, result);
    }
}