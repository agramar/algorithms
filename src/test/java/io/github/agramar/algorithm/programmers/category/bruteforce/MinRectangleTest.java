package io.github.agramar.algorithm.programmers.category.bruteforce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinRectangleTest {

    MinRectangle minRectangle = new MinRectangle();

    @Test
    void case1() {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int result = minRectangle.solution(sizes);
        assertEquals(4000, result);
    }

    @Test
    void case2() {
        int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int result = minRectangle.solution(sizes);
        assertEquals(120, result);
    }

    @Test
    void case3() {
        int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        int result = minRectangle.solution(sizes);
        assertEquals(133, result);
    }
}