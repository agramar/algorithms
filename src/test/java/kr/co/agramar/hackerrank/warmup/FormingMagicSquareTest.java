package kr.co.agramar.hackerrank.warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FormingMagicSquareTest {

    @Test
    public void case1() {

        int[][] input = {
            {5, 3, 4},
            {1, 5, 8},
            {6, 4, 2}
        };

        int output = FormingMagicSquare.formingMagicSquare(input);

        Assertions.assertEquals(7, output);
    }

    @Test
    public void case2() {

        int[][] input = {
            {4, 9, 2},
            {3, 5, 7},
            {8, 1, 5}
        };

        int output = FormingMagicSquare.formingMagicSquare(input);

        Assertions.assertEquals(1, output);
    }

    @Test
    public void case3() {

        int[][] input = {
            {4, 8, 2},
            {4, 5, 7},
            {6, 1, 6}
        };

        int output = FormingMagicSquare.formingMagicSquare(input);

        Assertions.assertEquals(4, output);
    }

    @Test
    public void case4() {

        int[][] input = {
                {4, 4, 7},
                {3, 1, 5},
                {1, 7, 9}
        };

        int output = FormingMagicSquare.formingMagicSquare(input);

        Assertions.assertEquals(20, output);
    }
}