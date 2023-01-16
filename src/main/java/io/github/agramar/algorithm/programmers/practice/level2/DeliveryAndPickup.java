package io.github.agramar.algorithm.programmers.practice.level2;

public class DeliveryAndPickup {

    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        // 어차피 배달 픽업을 함께 하려면 왕복 해야함 -> 가장 먼집부터 순서대로 하는게 효율적 -> 탐욕
        long answer = 0;
        int delivery = 0;
        int pickup = 0;
        for (int i = n - 1; i >= 0; --i) {
            if (deliveries[i] != 0 || pickups[i] != 0) {
                int cnt = 0;
                while (delivery < deliveries[i] || pickup < pickups[i]) {
                    ++cnt;
                    delivery += cap;
                    pickup += cap;
                }
                delivery -= deliveries[i];
                pickup -= pickups[i];
                answer = answer + ((long) (i + 1) * cnt * 2);
            }
        }

        return answer;
    }
}
