package kr.co.agramar.programmers.category.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution2Test {

    Solution2 solution2 = new Solution2();

    @Test
    void case1() {
        int[] numbers = new int[]{6, 10, 2};

        String actual = solution2.solution(numbers);

        String expected = "6210";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void case2() {
        int[] numbers = new int[]{3, 30, 34, 5, 9};

        String actual = solution2.solution(numbers);

        String expected = "9534330";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void case3() {
        int[] numbers = new int[]{21, 212};

        String actual = solution2.solution(numbers);

        String expected = "21221";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void case4() {
        int[] numbers = new int[]{12, 121};

        String actual = solution2.solution(numbers);

        String expected = "12121";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void case5() {
        int[] numbers = new int[]{0, 5, 10, 15, 20};

        String actual = solution2.solution(numbers);

        String expected = "52015100";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void case6() {
        int[] numbers = new int[]{1000, 0, 5, 99, 100};

        String actual = solution2.solution(numbers);

        String expected = "99510010000";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void case7() {
        int[] numbers = new int[]{0, 0, 0};

        String actual = solution2.solution(numbers);

        String expected = "0";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void case8() {
        int[] numbers = new int[]{104, 1, 0};

        String actual = solution2.solution(numbers);

        String expected = "11040";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void case9() {
        int[] numbers = new int[]{383, 38};

        String actual = solution2.solution(numbers);

        String expected = "38383";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void case10() {
        int[] numbers = new int[]{5, 546};

        String actual = solution2.solution(numbers);

        String expected = "5546";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void case11() {
        int[] numbers = new int[]{2, 20, 200};

        String actual = solution2.solution(numbers);

        String expected = "220200";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void case12() {
        int[] numbers = new int[]{2, 20, 100000};

        String actual = solution2.solution(numbers);

        String expected = "220100000";

        Assertions.assertEquals(expected, actual);
    }
}