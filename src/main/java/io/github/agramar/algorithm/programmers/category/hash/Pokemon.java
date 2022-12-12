package io.github.agramar.algorithm.programmers.category.hash;

import java.util.HashSet;
import java.util.Set;

public class Pokemon {

    public int solution(int[] nums) {

        int choiceCount = nums.length / 2;

        Set<Integer> pokemonSet = new HashSet<>();
        for (int num : nums) {
            pokemonSet.add(num);
        }

        return Math.min(pokemonSet.size(), choiceCount);
    }
}
