package io.github.agramar.algorithm.programmers.category.dfsbfs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameMapShortestPathTest {

    GameMapShortestPath gameMapShortestPath;

    @BeforeEach
    void setUp() {
        gameMapShortestPath = new GameMapShortestPath();
    }

    @Test
    void testCase1() {

        int[][] maps = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}
        };

        int result = gameMapShortestPath.solution(maps);

        assertEquals(11, result);
    }

    @Test
    void testCase2() {

        int[][] maps = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 0},
                {0, 0, 0, 0, 1}
        };

        int result = gameMapShortestPath.solution(maps);

        assertEquals(-1, result);
    }
}