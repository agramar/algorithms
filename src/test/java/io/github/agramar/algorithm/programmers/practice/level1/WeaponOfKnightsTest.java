package io.github.agramar.algorithm.programmers.practice.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeaponOfKnightsTest {

    WeaponOfKnights wok = new WeaponOfKnights();

    @Test
    void case1() {
        int number = 5;
        int limit = 3;
        int power = 2;

        int result = wok.solution(number, limit, power);

        assertEquals(10, result);
    }

    @Test
    void case2() {
        int number = 10;
        int limit = 3;
        int power = 2;

        int result = wok.solution(number, limit, power);

        assertEquals(21, result);
    }
}