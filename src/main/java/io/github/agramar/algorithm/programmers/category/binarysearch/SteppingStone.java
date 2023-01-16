package io.github.agramar.algorithm.programmers.category.binarysearch;

import java.util.Arrays;

public class SteppingStone {
    public int solution(int distance, int[] rocks, int n) {
        Arrays.sort(rocks);
        int[] distances = calculateDistances(distance, rocks);
        return binarySearch(distance, n, distances);
    }

    private static int binarySearch(int distance, int n, int[] distances) {
        int start = 0;
        int end = distance;
        while (start < end) {
            int mid = (start + end) / 2;
            int removedStone = 0;
            int current = 0;
            for (int d : distances) {
                current += d;
                if (current < mid) {
                    removedStone++;
                } else {
                    current = 0;
                }
            }

            if (removedStone > n) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start - 1;
    }

    private static int[] calculateDistances(int distance, int[] rocks) {
        int[] distances = new int[rocks.length + 1];
        distances[0] = rocks[0];
        distances[distances.length - 1] = distance - rocks[rocks.length - 1];
        for (int i = 1; i < rocks.length; i++) {
            distances[i] = rocks[i] - rocks[i - 1];
        }
        return distances;
    }
}
