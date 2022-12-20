package io.github.agramar.algorithm.programmers.category.bruteforce;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchPrimeNumberTest {

    SearchPrimeNumber searchPrimeNumber = new SearchPrimeNumber();


    @Test
    void case1() {
        String numbers = "17";

        int actual = searchPrimeNumber.solution(numbers);

        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void case2() {
        String numbers = "011";

        int actual = searchPrimeNumber.solution(numbers);

        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}