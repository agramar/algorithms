package io.github.agramar.algorithm.programmers.category.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class IslandConnection {

    public int solution(int n, int[][] costs) {
        // TODO

        Arrays.sort(costs, (Comparator.comparingInt(o -> o[2])));


        int answer = 0;
        return answer;
    }
}
