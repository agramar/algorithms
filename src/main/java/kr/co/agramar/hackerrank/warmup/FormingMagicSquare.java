package kr.co.agramar.hackerrank.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FormingMagicSquare {

    static int formingMagicSquare(int[][] s) {

        final int centerMagicNumber = 5;
        int centerNumberCost = Math.abs(centerMagicNumber - s[1][1]);

        final int[] outerMagicNumbers = {8, 1, 6, 7, 2, 9, 4, 3};
        final int[] outerMagicNumbersReverseX = {2, 9, 4, 3, 8, 1, 6, 7};
        final int[] outerMagicNumbersReverseY = {4, 9, 2, 7, 6, 1, 8, 3};

        int[] outerNumbers = getOuterNumbers(s);
        int outerNumberMinimalCost1 = getOuterNumberMinimalCost(outerNumbers, outerMagicNumbers);
        int outerNumberMinimalCost2 = getOuterNumberMinimalCost(outerNumbers, outerMagicNumbersReverseX);
        int outerNumberMinimalCost3 = getOuterNumberMinimalCost(outerNumbers, outerMagicNumbersReverseY);

        int outerNumberMinimalCost = Math.min(Math.min(outerNumberMinimalCost1, outerNumberMinimalCost2), outerNumberMinimalCost3);

        return centerNumberCost + outerNumberMinimalCost;
    }

    private static int getOuterNumberMinimalCost(int[] outerNumbers, int[] outerMagicNumbers) {

        int outerNumberMinimalCost = Integer.MAX_VALUE;

        for (int i = 0; i < outerMagicNumbers.length; i+= 2) {

            int sum = 0;

            for (int j = 0; j < outerNumbers.length; j++) {

                int outerNumber = outerNumbers[j];

                int outerMagicNumberIndex = i + j >= outerMagicNumbers.length ? i + j - outerMagicNumbers.length : i + j;
                int outerMagicNumber = outerMagicNumbers[outerMagicNumberIndex];

                sum += Math.abs(outerNumber - outerMagicNumber);
            }

            if (sum < outerNumberMinimalCost) {
                outerNumberMinimalCost = sum;
            }
        }

        return outerNumberMinimalCost;
    }

    private static int[] getOuterNumbers(int[][] s) {

        int outerNumbersLength = s.length * 2 + s[0].length * 2 - 4;

        int[] outerNumbers = new int[outerNumbersLength];

        int outerNumbersIndex = 0;
        int rowIndex = 0;
        int colIndex = 0;
        while (s.length > colIndex) {
            outerNumbers[outerNumbersIndex] = s[rowIndex][colIndex];
            outerNumbersIndex++;
            colIndex++;
        }
        colIndex--;

        while (s[0].length > rowIndex + 1) {
            rowIndex++;
            outerNumbers[outerNumbersIndex] = s[rowIndex][colIndex];
            outerNumbersIndex++;
        }

        while (0 < colIndex) {
            colIndex--;
            outerNumbers[outerNumbersIndex] = s[rowIndex][colIndex];
            outerNumbersIndex++;
        }

        while (0 < rowIndex - 1) {
            rowIndex--;
            outerNumbers[outerNumbersIndex] = s[rowIndex][colIndex];
            outerNumbersIndex++;
        }

        return outerNumbers;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
