package io.github.agramar.algorithm.programmers.category.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;

public class WordConversion {
    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length + 1];
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(begin, 0));
        visited[0] = true;

        int shortest = 0;
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            String word = node.getWord();

            System.out.println(node);
            if (target.equals(word)) {
                shortest = node.depth;
                break;
            }

            for (int i = 0; i < words.length; i++) {
                String nextWord = words[i];
                if (isConvertible(word, nextWord) && !visited[i + 1]) {
                    int depth = node.getDepth();
                    queue.add(new Node(nextWord, ++depth));
                    visited[i + 1] = true;
                }
            }
        }

        return shortest;
    }

    boolean isConvertible(String before, String next) {
        int beforeNextDifferCount = 0;
        for (int i = 0; i < before.length(); i++) {
            if (before.charAt(i) != next.charAt(i))
                beforeNextDifferCount++;
            if (beforeNextDifferCount > 1)
                return false;
        }

        return beforeNextDifferCount == 1;
    }

    static class Node {
        private final String word;
        private final int depth;

        public Node(String word, int depth) {
            this.word = word;
            this.depth = depth;
        }

        public String getWord() {
            return word;
        }

        public int getDepth() {
            return depth;
        }

        @Override
        public String toString() {
            return "[" + depth + "]" + word + " ";
        }
    }
}

