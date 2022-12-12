package io.github.agramar.algorithm.programmers.category.dfsbfs;

import java.util.Arrays;

public class Network {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(computers, i, visited);
                System.out.println();
                answer++;
            }
        }
        return answer;
    }

    boolean[] dfs(int[][] computers, int index, boolean[] visited) {
        visited[index] = true;
        for (int i = 0; i < computers.length; i++) {
            if (index != i && computers[index][i] == 1 && !visited[i]) {
                System.out.print(index);
                visited = dfs(computers, i, visited);
            }
        }
        return visited;
    }
}
