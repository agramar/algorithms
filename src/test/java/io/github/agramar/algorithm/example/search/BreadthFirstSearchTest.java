package io.github.agramar.algorithm.example.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BreadthFirstSearchTest {

    BreadthFirstSearch breadthFirstSearch;

    @BeforeEach
    void setUp() {
        breadthFirstSearch = new BreadthFirstSearch();

    }

    @Test
    void bfs() {
        int[][] graph = {
                {},
                {2, 3, 8},
                {1, 6, 8},
                {1, 5},
                {5, 7},
                {3, 4, 7},
                {2},
                {4, 5},
                {1, 2}
        };
        boolean[] visited = new boolean[graph.length];
        int nodeIndex = 1;
        breadthFirstSearch.bfsByQueue(graph, visited, nodeIndex);
    }
}