package kr.co.agramar.programmers.etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test02 {

    enum TestCase {
        CASE1(new int[]{5, 9, 7, 10}, 5, new int[]{5, 10}),
        CASE2(new int[]{2, 36, 1, 3}, 1, new int[]{1, 2, 3, 36}),
        CASE3(new int[]{3, 2, 6}, 10, new int[]{-1});

        public int[] array;
        public int divisor;
        public int[] result;

        TestCase(int[] array, int divisor, int[] result) {
            this.array = array;
            this.divisor = divisor;
            this.result = result;
        }
    }

    public static void main(String[] args) {
        for (TestCase value : TestCase.values()) {
            System.out.println(Arrays.toString(value.array) + value.divisor + Arrays.toString(value.result));
            if (!Arrays.equals(value.result, solution(value.array, value.divisor)))
                System.out.println("incorrect : " + Arrays.toString(solution(value.array, value.divisor)));
        }
    }

    public static int[] solution(int[] array, int divisor) {

        List<Integer> resultList = new ArrayList<>();
        for (int value : array) {
            if (value % divisor == 0) {
                resultList.add(value);
            }
        }

        if (resultList.size() == 0)
            return new int[]{-1};

        List<Integer> sortedResultList = resultList.stream().sorted(Integer::compareTo).collect(Collectors.toList());

        int[] result = new int[sortedResultList.size()];
        for (int i = 0; i < sortedResultList.size(); i++) {
            result[i] = sortedResultList.get(i);
        }
        return result;
    }
}

