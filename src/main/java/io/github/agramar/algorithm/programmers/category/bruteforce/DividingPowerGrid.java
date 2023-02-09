package io.github.agramar.algorithm.programmers.category.bruteforce;

public class DividingPowerGrid {

    public int solution(int n, int[][] wires) {
        int answer = 99;
        for (int i = 0; i < wires.length; i++) {
            int[][] divide = new int[wires.length - 1][2];
            for (int j = 0, k = 0; j < wires.length - 1; j++, k++) {
                if (i == j) k++;
                divide[j][0] = wires[k][0];
                divide[j][1] = wires[k][1];
            }
            int v1 = wires[i][0];
            int v2 = wires[i][1];

            boolean[] visited = new boolean[wires.length];
            int v1Index = dfs(divide, visited, 1, v1);
            int v2Index = dfs(divide, visited, 1, v2);
            answer = Math.min(answer, Math.abs(v1Index - v2Index));
        }
        return answer;
    }

    private int dfs(int[][] wires, boolean[] visited, int nodeIndex, int number) {
        for (int i = 0; i < wires.length; i++) {
            if (!visited[i]) {
                int v1 = wires[i][0];
                int v2 = wires[i][1];
                if (v1 == number) {
                    visited[i] = true;
                    nodeIndex = dfs(wires, visited, nodeIndex + 1, v2);
                }
                if (v2 == number) {
                    visited[i] = true;
                    nodeIndex = dfs(wires, visited, nodeIndex + 1, v1);
                }
            }
        }
        return nodeIndex;
    }
}
