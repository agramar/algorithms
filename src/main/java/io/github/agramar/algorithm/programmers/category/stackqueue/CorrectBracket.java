package io.github.agramar.algorithm.programmers.category.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class CorrectBracket {

    boolean solution(String s) {
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            if (c.equals("(")) {
                queue.add(c);
            } else if (queue.isEmpty()) {
                return false;
            } else {
                queue.poll();
            }
        }
        return queue.isEmpty();
    }
}