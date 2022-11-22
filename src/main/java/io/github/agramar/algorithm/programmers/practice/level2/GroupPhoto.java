package io.github.agramar.algorithm.programmers.practice.level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Collections.swap;

public class GroupPhoto {

    private Set<PhotoCondition> photoConditions;
    private int numberOfCases;

    public int solution(int n, String[] data) {
        if (n != data.length) {
            throw new IllegalArgumentException();
        }

        List<String> friends = Arrays.asList("A", "C", "F", "J", "M", "N", "R", "T");
        numberOfCases = 0;
        photoConditions = PhotoCondition.from(data);
        permutation(friends, 0);
        return numberOfCases;
    }


    private void permutation(List<String> friends, int index) {

        int length = friends.size();

        if (index == length - 1) {
            for (PhotoCondition photoCondition : photoConditions) {
                if (!photoCondition.isValid(friends)) {
                    return;
                }
            }

            numberOfCases++;
            return;
        }

        for (int i = index; i < length; i++) {
            swap(friends, index, i);
            permutation(friends, index + 1);
            swap(friends, index, i);
        }
    }
}

class PhotoCondition {
    private String kakaoFriend1;
    private String kakaoFriend2;
    private Condition condition;
    private int space;

    public static PhotoCondition from(String datum) {
        PhotoCondition pc = new PhotoCondition();
        pc.kakaoFriend1 = String.valueOf(datum.charAt(0));
        pc.kakaoFriend2 = String.valueOf(datum.charAt(2));
        pc.condition = Condition.from(String.valueOf(datum.charAt(3)));
        pc.space = Integer.parseInt(String.valueOf(datum.charAt(4)));
        return pc;
    }

    public static Set<PhotoCondition> from(String[] data) {
        Set<PhotoCondition> pcSet = new HashSet<>();
        for (String datum : data) {
            pcSet.add(PhotoCondition.from(datum));
        }
        return pcSet;
    }

    public boolean isValid(List<String> friends) {
        int distance = Math.abs(friends.indexOf(kakaoFriend1) - friends.indexOf(kakaoFriend2)) - 1;
        return this.condition.check(distance, this.space);
    }
}

enum Condition {
    EQUAL("=") {
        @Override
        boolean check(int distance, int space) {
            return distance == space;
        }
    },
    UNDER("<") {
        @Override
        boolean check(int distance, int space) {
            return distance < space;
        }
    },
    ABOVE(">") {
        @Override
        boolean check(int distance, int space) {
            return distance > space;
        }
    };

    private final String expression;

    Condition(String expression) {
        this.expression = expression;
    }

    abstract boolean check(int distance, int space);

    public String getExpression() {
        return expression;
    }

    static Condition from(String expression) {
        return Arrays.stream(Condition.values())
                .filter(e -> e.getExpression().equals(expression))
                .findAny()
                .orElseThrow();
    }
}