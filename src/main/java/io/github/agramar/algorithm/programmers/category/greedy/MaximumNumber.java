package io.github.agramar.algorithm.programmers.category.greedy;

public class MaximumNumber {

    public String solution(String number, int k) {

        int[] numbers = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            numbers[i] = Integer.parseInt(number.substring(i, i + 1));
        }

        int remain = k;
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < numbers.length; index++) {
            int maxNumber = -1;
            int maxNumberIndex = 0;
            for (int i = index; i < Math.min(index + remain + 1, numbers.length); i++) {
                if (numbers[i] > maxNumber) {
                    maxNumber = numbers[i];
                    maxNumberIndex = i;
                }
            }
            sb.append(maxNumber);
            remain = remain - (maxNumberIndex - index);
            index = maxNumberIndex;
            if (remain == 0) {
                for (int i = index + 1; i < numbers.length; i++) {
                    sb.append(numbers[i]);
                }
                break;
            }
        }

        return sb.substring(0, number.length() - k);
    }
}
