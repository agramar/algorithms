package io.github.agramar.algorithm.programmers.category.dfsbfs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NetworkTest {

    Network network;

    @BeforeEach
    void setUp() {
        network = new Network();
    }

    @Test
    void testCase1() {
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};

        int result = network.solution(n, computers);

        assertEquals(2, result);
    }

    @Test
    void testCase2() {
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};

        int result = network.solution(n, computers);

        assertEquals(1, result);
    }

    @Test
    void testCase3() {
        int n = 4;
        int[][] computers = {{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 0}, {1, 0, 0, 1}};

        int result = network.solution(n, computers);

        assertEquals(2, result);
    }

    @Test
    void testCase4() {
        int n = 7;
        int[][] computers = {
                {1, 0, 0, 0, 0, 0, 1},
                {0, 1, 1, 0, 1, 0, 0},
                {0, 1, 1, 1, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0},
                {0, 0, 0, 0, 1, 1, 1},
                {1, 0, 0, 0, 0, 1, 1}
        };

        int result = network.solution(n, computers);

        assertEquals(1, result);
    }
}