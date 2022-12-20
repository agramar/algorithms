package io.github.agramar.algorithm.programmers.category.bruteforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchPrimeNumber {
    public int solution(String numbers) {

        List<String> numberList = Arrays.stream(numbers.split("")).toList();

        List<String> allCases = new ArrayList<>();
        for (String number : numberList) {

        }

        // 0, 01, 02, 012, 021
        // 1, 10, 12, 102, 120

        // 0, 1, 2

        // 01, 02
        // 10, 12
        // 20, 21

        // 012, 021
        // 102, 120
        // 201, 210

        int answer = 0;
        return answer;
    }

    void combine() {

    }
}
