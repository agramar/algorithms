package io.github.agramar.algorithm.programmers.category.greedy;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Lifeboat {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        Deque<Integer> peopleDeque = new ArrayDeque<>(50000);
        for (int person : people) {
            peopleDeque.add(person);
        }

        int boatCount = 0;
        while (!peopleDeque.isEmpty()) {
            int weight = peopleDeque.pollLast();
            if (!peopleDeque.isEmpty() && weight + peopleDeque.peekFirst() <= limit) {
                peopleDeque.pollFirst();
            }
            boatCount++;
        }
        return boatCount;
    }
}
