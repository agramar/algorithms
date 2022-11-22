package io.github.agramar.algorithm.programmers.practice.level2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PathCycleOfLightTest {

    PathCycleOfLight pathCycleOfLight = new PathCycleOfLight();

    @Test
    void case1() {
        String[] grid = {"SL", "LR"};
        int[] result = pathCycleOfLight.solution(grid);
        assertEquals(List.of(16), Arrays.stream(result).boxed().collect(Collectors.toList()));
    }

    @Test
    void case2() {
        String[] grid = {"S"};
        int[] result = pathCycleOfLight.solution(grid);
        assertEquals(List.of(1, 1, 1, 1), Arrays.stream(result).boxed().collect(Collectors.toList()));
    }

    @Test
    void case3() {
        String[] grid = {"R", "R"};
        int[] result = pathCycleOfLight.solution(grid);
        assertEquals(List.of(4, 4), Arrays.stream(result).boxed().collect(Collectors.toList()));
    }

    @Test
    void case4() {
        String[] grid = {"S", "S"};
        int[] result = pathCycleOfLight.solution(grid);
        assertEquals(List.of(1, 1, 1, 1, 2, 2), Arrays.stream(result).boxed().collect(Collectors.toList()));
    }
}