package io.github.agramar.algorithm.programmers.category.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpeedCameraTest {

    SpeedCamera speedCamera = new SpeedCamera();

    @Test
    void case1() {
        int[][] routes = {{-20, -15}, {-14, -5}, {-18, -13}, {-5, -3}};
        int result = speedCamera.solution(routes);
        assertEquals(2, result);
    }
}