package kr.co.agramar.programmers.practice.level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BabblingTest {

    Babbling bab = new Babbling();

    @Test
    void case1() {
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};

        int result = bab.solution(babbling);

        assertEquals(1, result);
    }

    @Test
    void case2() {
        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        int result = bab.solution(babbling);

        assertEquals(3, result);
    }
}