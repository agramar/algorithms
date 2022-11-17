package io.github.agramar.algorithm.programmers.practice.level1;

import java.util.Arrays;
import java.util.List;

public class Babbling2 {
    public int solution(String[] babbling) {
        final List<String> babySyllables = List.of("aya", "ye", "woo", "ma");
        return (int) Arrays.stream(babbling)
                .filter(b -> {
                    for (String bs : babySyllables) {
                        if (b.contains(bs + bs)) {
                            return false;
                        }
                        b = b.replaceAll(bs, " ");
                    }
                    return b.trim().equals("");
                })
                .count();
    }
}
