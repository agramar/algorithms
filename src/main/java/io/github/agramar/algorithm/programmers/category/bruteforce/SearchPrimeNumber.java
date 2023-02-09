package io.github.agramar.algorithm.programmers.category.bruteforce;

import java.util.HashSet;
import java.util.Set;

public class SearchPrimeNumber {

    Set<Integer> numberSet;

    public int solution(String numbers) {
        int[] arr = numbersToArray(numbers);

        numberSet = new HashSet<>();
        for (int i = 1; i < arr.length + 1; i++) {
            perm(arr, 0, i, new boolean[arr.length], new int[i]);
        }

        return (int) numberSet.stream()
                .filter(n -> {
                    boolean pn = isPrimeNumber(n);
                    System.out.println(n + ":" + pn);
                    return isPrimeNumber(n);
                })
                .count();
    }

    private int[] numbersToArray(String numbers) {
        int[] arr = new int[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            arr[i] = Integer.parseInt(numbers.substring(i, i + 1));
        }
        return arr;
    }


    private void perm(int[] arr, int depth, int r, boolean[] visited, int[] output) {
        if (depth == r) {
            StringBuilder number = new StringBuilder();
            for (int i : output) {
                number.append(i);
            }
            numberSet.add(Integer.parseInt(number.toString()));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (depth == 0 && arr[i] == 0) {
                continue;
            }

            if (!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, depth + 1, r, visited, output);
                output[depth] = 0;
                visited[i] = false;
            }
        }
    }

    private boolean isPrimeNumber(int number) {
        if (number < 2) return false;
        if (number == 2) return true;
        for (int i = 2; i < number / 2 + 1; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
