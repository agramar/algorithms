package kr.co.agramar.programmers.practice.level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FruitSeller {
    public int solution(int k, int m, int[] score) {

        List<Integer> scores = Arrays.stream(score)
                .boxed()
                .sorted(Comparator.comparingInt(value -> (int) value).reversed())
                .collect(Collectors.toList());

        int money = 0;
        for (int i = 0; i < scores.size() - m + 1; i += m) {
            money += scores.get(i + m - 1) * m;
        }

        return money;
    }
}