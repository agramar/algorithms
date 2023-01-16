package io.github.agramar.algorithm.programmers.category.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkoutClothes {

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        List<Integer> realLostList = new ArrayList<>();
        for (int l : lost) {
            boolean realLost = true;
            for (int i = 0; i < reserve.length; i++) {
                if (l == reserve[i]) {
                    reserve[i] = 10000;
                    realLost = false;
                    break;
                }
            }
            if (realLost) realLostList.add(l);
        }

        for (int l : realLostList) {
            boolean borrow = false;
            for (int i = 0; i < reserve.length; i++) {
                if (l + 1 == reserve[i] || l - 1 == reserve[i]) {
                    reserve[i] = 10000;
                    borrow = true;
                    break;
                }
            }
            if (!borrow) answer--;
        }

        return answer;
    }
}
