package io.github.agramar.algorithm.programmers.category.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImmigrationTest {

    Immigration immigration = new Immigration();

    @Test
    void case1() {
        int n = 6;
        int[] times = {7, 10};
        long result = immigration.solution(n, times);
        assertEquals(28, result);
    }

    @Test
    void case2() {
        int n = 10;
        int[] times = {7, 10, 13};
        long result = immigration.solution(n, times);
        assertEquals(35, result);
    }

    @Test
    void case3() {
        int n = 10;
        int[] times = {1, 5};
        long result = immigration.solution(n, times);
        assertEquals(9, result);
    }
}