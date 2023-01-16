package io.github.agramar.algorithm.programmers.category.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LifeboatTest {

    Lifeboat lifeboat = new Lifeboat();

    @Test
    void case1() {
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        int result = lifeboat.solution(people, limit);
        assertEquals(3, result);
    }

    @Test
    void case2() {
        int[] people = {70, 80, 50};
        int limit = 100;
        int result = lifeboat.solution(people, limit);
        assertEquals(3, result);
    }

    @Test
    void case3() {
        int[] people = {40, 40, 60, 70, 80, 50};
        int limit = 100;
        int result = lifeboat.solution(people, limit);
        assertEquals(4, result);
    }
}