package io.github.agramar.algorithm.programmers.category.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokemonTest {

    Pokemon pokemon;

    @BeforeEach
    void setUp() {
        pokemon = new Pokemon();
    }

    @Test
    void case1() {
        int[] nums = {3, 1, 2, 3};

        int result = pokemon.solution(nums);

        Assertions.assertEquals(2, result);
    }

    @Test
    void case2() {
        int[] nums = {3, 3, 3, 2, 2, 4};

        int result = pokemon.solution(nums);

        Assertions.assertEquals(3, result);
    }

    @Test
    void case3() {
        int[] nums = {3, 3, 3, 2, 2, 2};

        int result = pokemon.solution(nums);

        Assertions.assertEquals(2, result);
    }
}
