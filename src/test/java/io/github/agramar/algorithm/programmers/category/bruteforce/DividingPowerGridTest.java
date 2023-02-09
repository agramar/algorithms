package io.github.agramar.algorithm.programmers.category.bruteforce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividingPowerGridTest {

    DividingPowerGrid dividingPowerGrid = new DividingPowerGrid();

    @Test
    void case1() {
        int n = 9;
        int[][] wires = {{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}};
        int result = dividingPowerGrid.solution(n, wires);
        assertEquals(3, result);
    }

    @Test
    void case2() {
        int n = 4;
        int[][] wires = {{1, 2}, {2, 3}, {3, 4}};
        int result = dividingPowerGrid.solution(n, wires);
        assertEquals(0, result);
    }

    @Test
    void case3() {
        int n = 7;
        int[][] wires = {{1, 2}, {2, 7}, {3, 7}, {3, 4}, {4, 5}, {6, 7}};
        int result = dividingPowerGrid.solution(n, wires);
        assertEquals(1, result);
    }
}