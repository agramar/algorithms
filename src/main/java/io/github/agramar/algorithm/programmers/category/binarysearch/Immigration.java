package io.github.agramar.algorithm.programmers.category.binarysearch;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Immigration {

    public long solution(int n, int[] times) {

        double totalOutputPerTime = 0;
        for (int time : times) {
            totalOutputPerTime += (double) 1 / time;
        }
        long time = (long) (n / totalOutputPerTime);

        PriorityQueue<long[]> queue = new PriorityQueue<>(Comparator.comparing(l -> l[0] + l[1]));
        for (int t : times) {
            long count = time / t;
            queue.offer(new long[]{t, count * t});
            n -= count;
        }

        for (int i = 0; i < n; i++) {
            long[] tmp = queue.poll();
            assert tmp != null;
            tmp[1] += tmp[0];
            queue.offer(tmp);
            time = tmp[1];
        }

        return time;
    }
}
