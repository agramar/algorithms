package io.github.agramar.algorithm.example.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CombinationTest {

    Combination combination;

    @BeforeEach
    void setUp() {
        combination = new Combination();
    }


    @Test
    void combinationByBackTracking() {

        int[] arr = {1, 2, 3, 4, 5};
        boolean[] visited = new boolean[arr.length];
        int start = 0;
        int r = 3;

        combination.combinationByBackTracking(arr, visited, start, r);
    }

    @Test
    void combinationByRecurrence() {

        int[] arr = {1, 2, 3, 4, 5};
        boolean[] visited = new boolean[arr.length];
        int depth = 0;
        int r = 3;

        combination.combinationByRecurrence(arr, visited, depth, r);
    }
}