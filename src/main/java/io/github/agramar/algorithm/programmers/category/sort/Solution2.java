package io.github.agramar.algorithm.programmers.category.sort;

import java.util.Arrays;

class Solution2 {
    public String solution(int[] numbers) {
        String answer = Arrays.stream(numbers)
                .mapToObj(Integer::toString)
                .sorted((p1, p2) -> {
                    int sum1 = Integer.parseInt(p1 + p2);
                    int sum2 = Integer.parseInt(p2 + p1);
                    return Integer.compare(sum2, sum1);
                })
                .reduce((s1, s2) -> s1 + s2)
                .orElse("0");
        return answer.startsWith("0") ? "0" : answer;
    }
}
