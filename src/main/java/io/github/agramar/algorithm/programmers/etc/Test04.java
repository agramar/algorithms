package io.github.agramar.algorithm.programmers.etc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test04 {

    enum TestCase {

        CASE1(118372, 873211);

        public long n;
        public long result;

        TestCase(long n, long result) {
            this.n = n;
            this.result = result;
        }
    }

    public static void main(String[] args) {
        for (TestCase value : TestCase.values()) {

            long result = solution(value.n);

            System.out.println(value.n + "/" + result);

            if (value.result != result) {
                System.out.println("오류");
            }
        }
    }

    public static long solution(long n) {
        String nString = String.valueOf(n);
        List<Long> nList = new ArrayList<>();
        for (int i = 0; i < nString.length(); i++) {
            nList.add(Long.parseLong(nString.substring(i, i + 1)));
        }

        return new Long(nList.stream()
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining()));
    }
}

