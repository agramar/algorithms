package io.github.agramar.algorithm.programmers.practice.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Babbling2Test {

    Babbling2 bab = new Babbling2();

    @Test
    void case1() {
        String[] babbling = {"aya", "yee", "u", "maa"};

        int result = bab.solution(babbling);

        assertEquals(1, result);
    }

    @Test
    void case2() {
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};

        int result = bab.solution(babbling);

        assertEquals(2, result);
    }
}