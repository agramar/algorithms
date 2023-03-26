package io.github.agramar.algorithm.programmers.category.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IslandConnectionTest {
    IslandConnection islandConnection = new IslandConnection();

    @Test
    void case1() {
        int n = 4;
        int[][] costs = {{0, 1, 1}, {0, 2, 2}, {1, 2, 5}, {1, 3, 1}, {2, 3, 8}};
        int result = islandConnection.solution(n, costs);
        assertEquals(4, result);
    }
}