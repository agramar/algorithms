package io.github.agramar.algorithm.example.search;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    /**
     * Queue를 이용한 BFS구현
     */
    public void bfsByQueue(int[][] graph, boolean[] visited, int nodeIndex) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(nodeIndex);
        visited[nodeIndex] = true;
        while (!queue.isEmpty()) {
            nodeIndex = queue.poll();
            System.out.print(nodeIndex + " ");
            for (int i = 0; i < graph[nodeIndex].length; i++) {
                int temp = graph[nodeIndex][i];
                if (!visited[temp]) {
                    visited[temp] = true;
                    queue.offer(temp);
                }
            }
        }
    }
}
