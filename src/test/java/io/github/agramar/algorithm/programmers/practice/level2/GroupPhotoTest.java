package io.github.agramar.algorithm.programmers.practice.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GroupPhotoTest {

    GroupPhoto groupPhoto = new GroupPhoto();

    @Test
    void case1() {
        int n = 2;
        String[] data = {"N~F=0", "R~T>2"};

        int answer = groupPhoto.solution(n, data);

        assertEquals(3648, answer);
    }


    @Test
    void case2() {
        int n = 2;
        String[] data = {"M~C<2", "C~M>1"};

        int answer = groupPhoto.solution(n, data);

        assertEquals(0, answer);
    }

    @Test
    void case3() {
        int n = 1;
        String[] data = {"C~M>6"};

        int answer = groupPhoto.solution(n, data);

        assertEquals(0, answer);
    }

    @Test
    void case4() {
        int n = 1;
        String[] data = {"C~M>5"};

        int answer = groupPhoto.solution(n, data);

        assertEquals(1440, answer);
    }
}