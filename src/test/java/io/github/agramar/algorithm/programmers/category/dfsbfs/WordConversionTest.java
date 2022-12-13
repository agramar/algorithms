package io.github.agramar.algorithm.programmers.category.dfsbfs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordConversionTest {

    WordConversion wordConversion;

    @BeforeEach
    void setUp() {
        wordConversion = new WordConversion();
    }

    @Test
    void testCase1() {
        String begin = "hit", target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        int answer = wordConversion.solution(begin, target, words);

        assertEquals(4, answer);
    }

    @Test
    void testCase2() {
        String begin = "hit", target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log"};

        int answer = wordConversion.solution(begin, target, words);

        assertEquals(0, answer);
    }

    @Test
    void testCase3() {
        String begin = "aaaaaaaaaa", target = "bbbbbbbbbb";
        String[] words = {"aaaaaaaaab", "aaaaaaaabb", "aaaaaaabbb", "aaaaaabbbb", "aaaaabbbbb", "aaaabbbbbb", "aaabbbbbbb", "aabbbbbbbb", "abbbbbbbbb",
                "aaaabaaaaa", "aaaabaaaba", "aaabbaaaab", "babaaabaab", "abbaaaabbb", "bbaabbbbaa", "babaabbbbb", "abbbbbbabb", "babbbbbbbb", "bbabbbbbbb", "bbbabbbbbb"};

        int answer = wordConversion.solution(begin, target, words);

        assertEquals(0, answer);
    }

    @Test
    void testCase4() {
        String begin = "hit", target = "cog";
        String[] words = {"hot", "lit", "lig", "tig", "dot", "dog", "cog"};

        /*
         *  hit -> hot  -> dot  -> dog -> cog   4
         *         lit  -> lig  -> tig
         */
        int answer = wordConversion.solution(begin, target, words);

        assertEquals(4, answer);
    }

    @Test
    void testCase5() {
        String begin = "aoa", target = "aof";
        String[] words = {"aob", "aoc", "aod", "aof", "aoe"};


        int answer = wordConversion.solution(begin, target, words);

        assertEquals(1, answer);
    }
}