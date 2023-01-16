package io.github.agramar.algorithm.programmers.category.greedy;

import java.util.ArrayList;
import java.util.List;

public class Joystick {
    public int solution(String name) {
        int startNum = Character.getNumericValue('A');
        int endNum = Character.getNumericValue('Z') + 1;

        List<Integer> differenceList = new ArrayList<>();
        for (char c : name.toCharArray()) {
            int cNum = Character.getNumericValue(c);
            int difference = Math.min(cNum - startNum, endNum - cNum);
            differenceList.add(difference);
        }

        int alphabetCount = calculateMinAlphabetCount(differenceList);
        int moveCount = calculateMinMoveCount(differenceList);
        return moveCount + alphabetCount;
    }

    private int calculateMinAlphabetCount(List<Integer> differenceList) {
        return differenceList.stream().mapToInt(a -> a).sum();
    }

    private int calculateMinMoveCount(List<Integer> differenceList) {
        int size = differenceList.size();
        int moveCount = size - 1;
        int index;
        for (int i = 0; i < size; i++) {
            index = i + 1;
            while (index < size && differenceList.get(index) == 0) {
                index++;
            }
            moveCount = Math.min(moveCount, i * 2 + size - index);
            moveCount = Math.min(moveCount, (size - index) * 2 + i);
        }
        return moveCount;
    }
}
