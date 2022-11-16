package kr.co.agramar.programmers.category.bruteforce;

import kr.co.agramar.programmers.category.bruteforce.Solution2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution2Test {

    Solution2 solution = new Solution2();


    @Test
    void case1() {
        String numbers = "17";

        int actual = solution.solution(numbers);

        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void case2() {
        String numbers = "011";

        int actual = solution.solution(numbers);

        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}