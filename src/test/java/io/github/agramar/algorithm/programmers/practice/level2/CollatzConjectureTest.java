package io.github.agramar.algorithm.programmers.practice.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

class CollatzConjectureTest {

    CollatzConjecture collatzConjecture = new CollatzConjecture();

    @Test
    void case1() {
        int k = 5;
        int[][] ranges = {{0, 0}, {0, -1}, {2, -3}, {3, -3}};

        double[] actual = collatzConjecture.solution(k, ranges);

        double[] expected = {33.0, 31.5, 0.0, -1.0};
        Assertions.assertEquals(Arrays.stream(expected).boxed().collect(Collectors.toList()), Arrays.stream(actual).boxed().collect(Collectors.toList()));
    }
}