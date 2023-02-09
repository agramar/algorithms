package io.github.agramar.algorithm.programmers.category.bruteforce;

public class DegreeOfFatigue {

    private int max;

    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        max = 0;
        go(dungeons, 0, visited, k);
        return max + 1;
    }

    private void go(int[][] dungeons, int depth, boolean[] visited, int k) {
        if (max == dungeons.length) {
            return;
        }

        for (int i = 0; i < dungeons.length; i++) {
            int[] dungeon = dungeons[i];
            int requiredFatigue = dungeon[0];
            int consumeFatigue = dungeon[1];
            if (!visited[i]) {
                if (requiredFatigue <= k && consumeFatigue <= k) {
                    visited[i] = true;
                    k -= consumeFatigue;
                    if (max < depth) max = depth;
                    go(dungeons, depth + 1, visited, k);
                    k += consumeFatigue;
                }
                visited[i] = false;
            }
        }
    }
}
