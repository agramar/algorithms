package kr.co.agramar.programmers.practice.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FruitSellerTest {

    FruitSeller fruitSeller = new FruitSeller();

    @Test
    void case1() {
        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 1};

        int result = fruitSeller.solution(k, m, score);

        assertEquals(8, result);
    }

    @Test
    void case2() {
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        int result = fruitSeller.solution(k, m, score);

        assertEquals(33, result);
    }
}