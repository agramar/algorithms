package kr.co.agramar.programmers.practice.level0;

import java.util.Arrays;
import java.util.List;

public class Babbling {
    public int solution(String[] babbling) {

        List<String> babySyllables = List.of("aya", "ye", "woo", "ma");
        return (int) Arrays.stream(babbling).filter(b -> {
            String ba = b;
            for (String bs : babySyllables) {
                ba = ba.replaceAll(bs, " ");
            }
            return ba.trim().equals("");
        }).count();
    }
}
