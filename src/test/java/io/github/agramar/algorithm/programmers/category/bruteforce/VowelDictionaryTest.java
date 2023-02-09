package io.github.agramar.algorithm.programmers.category.bruteforce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelDictionaryTest {

    VowelDictionary vowelDictionary = new VowelDictionary();

    @Test
    void case1() {
        String word = "AAAAE";
        int result = vowelDictionary.solution(word);
        assertEquals(6, result);
    }

    @Test
    void case2() {
        String word = "AAAE";
        int result = vowelDictionary.solution(word);
        assertEquals(10, result);
    }

    @Test
    void case3() {
        String word = "I";
        int result = vowelDictionary.solution(word);
        assertEquals(1563, result);
    }

    @Test
    void case4() {
        String word = "EIO";
        int result = vowelDictionary.solution(word);
        assertEquals(1189, result);
    }
}