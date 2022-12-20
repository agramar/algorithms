package io.github.agramar.algorithm.example.search;

import java.util.Stack;

public class DepthFirstSearch {

    /**
     * 재귀를 이용한 DFS 구현
     */
    public void dfsByRecurrence(int[][] graph, boolean[] visited, int nodeIndex) {
        visited[nodeIndex] = true;
        System.out.print(nodeIndex + " ");
        for (int node : graph[nodeIndex]) {
            if (!visited[node]) {
                dfsByRecurrence(graph, visited, node);
            }
        }
    }

    /**
     * 스택을 이용한 DFS 구현
     */
    public void dfsByStack(int[][] graph, boolean[] visited, int nodeIndex) {
        Stack<Integer> stack = new Stack<>();
        stack.push(nodeIndex);
        visited[nodeIndex] = true;
        while (!stack.isEmpty()) {
            nodeIndex = stack.pop();
            System.out.print(nodeIndex + " ");
            for (int linkedNodeIndex : graph[nodeIndex]) {
                if (!visited[linkedNodeIndex]) {
                    stack.push(linkedNodeIndex);
                    visited[linkedNodeIndex] = true;
                }
            }
        }
    }
}
