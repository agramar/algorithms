package io.github.agramar.algorithm.programmers.etc;

public class Test05 {

    enum TestCase {

        CASE1(10, true),
        CASE2(12, true),
        CASE3(11, false),
        CASE4(13, false);

        public int x;
        public boolean result;

        TestCase(int x, boolean result) {
            this.x = x;
            this.result = result;
        }
    }

    public static void main(String[] args) {
        for (TestCase value : TestCase.values()) {

            boolean result = solution(value.x);

            System.out.println(value.x + "/" + result);

            if (value.result != result) {
                System.out.println("오류");
            }
        }
    }

    public static boolean solution(int x) {
        int sum = 0;
        String xString = String.valueOf(x);
        for (int i = 0; i < xString.length() ; i++) {
            sum += Integer.parseInt(xString.substring(i, i+ 1));
        }
        return x % sum == 0;
    }
}

