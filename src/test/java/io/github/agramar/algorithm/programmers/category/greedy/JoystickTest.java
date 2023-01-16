package io.github.agramar.algorithm.programmers.category.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JoystickTest {

    Joystick joystick = new Joystick();

    @Test
    void testCase1() {
        String name = "JEROEN";
        int result = joystick.solution(name);
        assertEquals(56, result);
    }

    @Test
    void testCase2() {
        String name = "JAN";
        int result = joystick.solution(name);
        assertEquals(23, result);
    }

    @Test
    void testCase3() {
        String name = "AAAAA";
        int result = joystick.solution(name);
        assertEquals(0, result);
    }

    @Test
    void testCase4() {
        String name = "AAAEASAHQAYTAAAJ";
        int result = joystick.solution(name);
        assertEquals(60, result);
    }

    @Test
    void testCase5() {
        String name = "ABAAB";  // 3
        int result = joystick.solution(name);
        assertEquals(5, result);
    }
}