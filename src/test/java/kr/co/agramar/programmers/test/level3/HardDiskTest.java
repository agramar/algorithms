package kr.co.agramar.programmers.test.level3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HardDiskTest {

    HardDisk hardDisk = new HardDisk();

    @Test
    void test() {
        int[][] case1 = new int[][]{{0, 3}, {1, 9}, {2, 6}};

        int result = hardDisk.solution(case1);

        assertEquals(9, result);
    }
}