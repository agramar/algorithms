package io.github.agramar.algorithm.programmers.practice.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollatzConjecture {

    public double[] solution(int k, int[][] ranges) {
        List<Integer> yList = new ArrayList<>();
        calculate(k, 0, yList);
        int endX = yList.size() - 1;
        return Arrays.stream(ranges)
                .mapToDouble(range -> {

                    int x1 = range[0];
                    int x2 = endX + range[1];
                    if (x1 == x2) {
                        return 0;
                    }

                    if (x1 > x2) {
                        return -1;
                    }

                    return calculateArea(yList, x1, x2);
                })
                .toArray();
    }

    private static double calculateArea(List<Integer> yList, int x1, int x2) {
        double area = 0;
        for (int i = x1; i < x2; i++) {
            int y1 = yList.get(i);
            int y2 = yList.get(i + 1);
            double maxY = Math.max(y1, y2);
            double minY = Math.min(y1, y2);
            double unitArea = maxY - ((maxY - minY) / 2);
            area += unitArea;
        }
        return area;
    }

    public void calculate(int k, int x, List<Integer> yList) {

        yList.add(k);
        if (k == 1) return;

        x++;
        if (k % 2 == 0) {
            k = k / 2;
        } else {
            k = k * 3 + 1;
        }

        calculate(k, x, yList);
    }
}
