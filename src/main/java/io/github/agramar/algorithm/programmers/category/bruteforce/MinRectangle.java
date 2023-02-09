package io.github.agramar.algorithm.programmers.category.bruteforce;

public class MinRectangle {

    public int solution(int[][] sizes) {

        int max = 1;
        int min = 1;
        for (int[] size : sizes) {
            int w = size[0];
            int h = size[1];
            max = Integer.max(max, Integer.max(w, h));
            min = Integer.max(min, Integer.min(w, h));
        }
        return max * min;

    }
}
