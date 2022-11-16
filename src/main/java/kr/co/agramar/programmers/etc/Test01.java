package kr.co.agramar.programmers.etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {

    enum TestCase {
        CASE1(new int[]{1, 1, 3, 3, 0, 1, 1}, new int[]{1, 3, 0, 1}),
        CASE2(new int[]{4, 4, 4, 3, 3}, new int[]{4, 3});

        public int[] array;
        public int[] result;

        TestCase(int[] array, int[] result) {
            this.array = array;
            this.result = result;
        }
    }

    public static void main(String[] args) {
        for (TestCase value : TestCase.values()) {

            int[] result = solution(value.array);

            if (!Arrays.equals(result, value.result)) {
                System.out.println("array1 오답 : " + Arrays.toString(result));
            }
        }
    }

    public static int[] solution(int[] arr) {

        List<Integer> integerList = new ArrayList<>();
        for (int i : arr) {
            if (integerList.size() > 0) {
                int last = integerList.get(integerList.size() - 1);
                if (last == i) {
                    continue;
                }
            }

            integerList.add(i);
        }

        int[] intArray = new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) {
            intArray[i] = integerList.get(i);
        }

        return intArray;
    }
}