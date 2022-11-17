package io.github.agramar.algorithm.programmers.practice.level0;

import java.util.Arrays;
import java.util.List;

public class Babbling {
    public int solution(String[] babbling) {
        final List<String> babySyllables = List.of("aya", "ye", "woo", "ma");
        return (int) Arrays.stream(babbling)
                .filter(b -> {
                    for (String bs : babySyllables) {
                        b = b.replaceAll(bs, " ");
                    }
                    return b.trim().equals("");
                })
                .count();
    }
}
