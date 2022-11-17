package io.github.agramar.algorithm.programmers.practice.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MakingHamburgerTest {

    MakingHamburger solution = new MakingHamburger();

    @Test
    void case1() {
        int[] case1 = {2, 1, 1, 2, 3, 1, 2, 3, 1};

        int result = solution.solution(case1);

        assertEquals(2, result);
    }

    @Test
    void case2() {
        int[] case1 = {1, 3, 2, 1, 2, 1, 3, 1, 2};

        int result = solution.solution(case1);

        assertEquals(0, result);
    }

    @Test
    void case3() {
        int[] case1 = {1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 1, 1, 2, 3, 3, 1, 2, 3, 1, 3, 3, 3, 2, 1, 2, 3, 1};

        int result = solution.solution(case1);

        assertEquals(5, result);
    }

    @Test
    void case4() {
        int[] case1 = {1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 1, 1, 2, 3, 3, 1};

        int result = solution.solution(case1);

        assertEquals(3, result);
    }

    @Test
    void case5() {
        int[] case1 = {1, 1, 2, 1, 2, 3, 1, 3, 1, 2, 3, 1};

        int result = solution.solution(case1);

        assertEquals(3, result);
    }
}