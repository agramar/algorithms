package io.github.agramar.algorithm.programmers.category.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;

public class GameMapShortestPath {

    public int solution(int[][] maps) {
        return bfs(maps).getLastDepth(maps);
    }

    Node bfs(int[][] maps) {

        boolean[][] visited = new boolean[maps.length][maps[0].length];
        visited[0][0] = true;

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, 0, 1));

        while (true) {
            Node currentNode = queue.poll();
            int x = currentNode.getX();
            int y = currentNode.getY();
            int depth = currentNode.getDepth();
            if (x == maps.length - 1 && y == maps[0].length - 1) {
                return currentNode;
            }

            if (x + 1 < maps.length && !visited[x + 1][y] && maps[x + 1][y] == 1) {
                visited[x + 1][y] = true;
                queue.add(new Node(x + 1, y, depth + 1));
            }

            if (y + 1 < maps[0].length && !visited[x][y + 1] && maps[x][y + 1] == 1) {
                visited[x][y + 1] = true;
                queue.add(new Node(x, y + 1, depth + 1));
            }

            if (x - 1 >= 0 && !visited[x - 1][y] && maps[x - 1][y] == 1) {
                visited[x - 1][y] = true;
                queue.add(new Node(x - 1, y, depth + 1));
            }

            if (y - 1 >= 0 && !visited[x][y - 1] && maps[x][y - 1] == 1) {
                visited[x][y - 1] = true;
                queue.add(new Node(x, y - 1, depth + 1));
            }

            if (queue.isEmpty()) {
                return currentNode;
            }
        }
    }

    static class Node {
        private final int x;
        private final int y;
        private final int depth;

        public Node(int x, int y, int depth) {
            this.x = x;
            this.y = y;
            this.depth = depth;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getDepth() {
            return depth;
        }

        public int getLastDepth(int[][] maps) {
            return x != maps.length - 1 || y != maps[0].length - 1 ? -1 : depth;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "x=" + x +
                    ", y=" + y +
                    ", depth=" + depth +
                    '}';
        }
    }
}

