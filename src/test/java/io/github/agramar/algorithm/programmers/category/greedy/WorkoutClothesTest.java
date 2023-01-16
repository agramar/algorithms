package io.github.agramar.algorithm.programmers.category.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkoutClothesTest {

    WorkoutClothes workoutClothes = new WorkoutClothes();

    @Test
    void testCase1() {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        int result = workoutClothes.solution(n, lost, reserve);

        assertEquals(5, result);
    }

    @Test
    void testCase2() {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {3};

        int result = workoutClothes.solution(n, lost, reserve);

        assertEquals(4, result);
    }

    @Test
    void testCase3() {
        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};

        int result = workoutClothes.solution(n, lost, reserve);

        assertEquals(2, result);
    }
}