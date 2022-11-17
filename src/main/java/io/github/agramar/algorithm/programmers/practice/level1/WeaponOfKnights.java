package io.github.agramar.algorithm.programmers.practice.level1;

public class WeaponOfKnights {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i < number + 1; i++) {
            int divisor = calculateDivisorCount(i);
            answer += (divisor > limit) ? power : divisor;
        }

        return answer;
    }

    private int calculateDivisorCount(int number) {
        int divisorCount = 0;
        for (int i = 1; i <= number / i; i++) {
            if (number % i == 0) {
                if (i == number / i) {
                    divisorCount++;
                    break;
                }
                divisorCount += 2;
            }
        }
        return divisorCount;
    }
}
