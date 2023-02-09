package io.github.agramar.algorithm.programmers.category.bruteforce;

public class VowelDictionary {

    char[] vowels = {'A', 'E', 'I', 'O', 'U'};
    String searchWord;
    int index;
    int searchIndex;

    public int solution(String word) {
        searchWord = word;
        index = 0;
        searchIndex = 0;
        searchDictionary(0, "");
        return searchIndex;
    }

    void searchDictionary(int level, String word) {
        if (word.equals(searchWord)) {
            searchIndex = index;
            return;
        }

        index++;
        if (level == 5) return;

        for (int i = 0; i < 5; i++) {
            searchDictionary(level + 1, word + vowels[i]);
        }
    }
}
