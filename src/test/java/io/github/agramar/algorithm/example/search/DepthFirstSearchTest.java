package io.github.agramar.algorithm.example.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class DepthFirstSearchTest {

    DepthFirstSearch depthFirstSearch;

    @BeforeEach
    void setUp() {
        depthFirstSearch = new DepthFirstSearch();
    }

    @Test
    void dfsByRecurrence() {
        int[][] graph = {{}, {2, 3, 8}, {1, 6, 8}, {1, 5}, {5, 7}, {3, 4, 7}, {2}, {4, 5}, {1, 2}};
        boolean[] visited = new boolean[graph.length];
        int nodeIndex = 1;
        depthFirstSearch.dfsByRecurrence(graph, visited, nodeIndex);
    }

    @Test
    void dfsByStack() {
        int[][] graph = {{}, {2, 3, 8}, {1, 6, 8}, {1, 5}, {5, 7}, {3, 4, 7}, {2}, {4, 5}, {1, 2}};
        boolean[] visited = new boolean[graph.length];
        int nodeIndex = 1;
        depthFirstSearch.dfsByStack(graph, visited,nodeIndex);
    }
}