package io.github.agramar.algorithm.example.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationTest {

    Permutation permutation;

    @BeforeEach
    void setUp() {
        permutation = new Permutation();
    }

    @Test
    void permutationByVisited() {
        int[] arr = {1, 2, 3, 4, 5};
        int r = 2;
        int depth = 0;
        boolean[] visited = new boolean[arr.length];
        int[] output = new int[r];
        permutation.permutationByVisited(arr, depth, r, visited, output);
    }

    @Test
    void permutationBySwap() {
        int[] arr = {1, 2, 3, 4, 5};
        int depth = 0;
        int r = 2;
        permutation.permutationBySwap(arr, depth, r);
    }
}