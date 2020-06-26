package kr.co.agramar.test;

import java.util.Arrays;

public class Test03 {

    enum TestCase {
        CASE1(2, 5, new long[]{2, 4, 6, 8, 10}),
        CASE2(4, 3, new long[]{4, 8, 12}),
        CASE3(-4, 2, new long[]{-4, -8});

        public int x;
        public int y;
        public long[] result;

        TestCase(int x, int y, long[] result) {
            this.x = x;
            this.y = y;
            this.result = result;
        }
    }

    public static void main(String[] args) {


        for (TestCase value : TestCase.values()) {

            long[] result = solution(value.x, value.y);

            System.out.println(value.x + " / " + value.y + " = " + Arrays.toString(value.result));
            if (!Arrays.equals(value.result, result))
                System.out.println("incorrect : " + Arrays.toString(result));
        }
    }

    public static long[] solution(int x, int y) {
        if (x < -10000000) x = -10000000;
        if (x > 10000000) x = 10000000;
        if (y > 1000) y = 1000;

        long[] result = new long[y];
        for (int i = 0; i < y; i++) {
            result[i] = (i + 1) * x;
        }
        return result;
    }
}

