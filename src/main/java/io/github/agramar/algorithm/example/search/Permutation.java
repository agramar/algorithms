package io.github.agramar.algorithm.example.search;

/**
 * 순열 : n 개의 원소 중에서 r 개의 원소를 순서까지 고려하여 뽑는 경우
 */
public class Permutation {

    /**
     * visited를 활용해 순서 대로 n개 중에서 r개를 뽑는 경우
     */
    public void permutationByVisited(int[] arr, int depth, int r, boolean[] visited, int[] output) {
        if (depth == r) {
            printResult(output, r);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                permutationByVisited(arr, depth + 1, r, visited, output);
                output[depth] = 0;
                visited[i] = false;
            }
        }
    }

    /**
     * swap을 활용해 순서 관계 없이 n개 중에서 r개를 뽑는 경우
     */
    public void permutationBySwap(int[] arr, int depth, int r) {
        if (depth == r) {
            printResult(arr, r);
            return;
        }

        for (int i = depth; i < arr.length; i++) {
            swap(arr, depth, i);
            permutationBySwap(arr, depth + 1, r);
            swap(arr, depth, i);
        }
    }

    private void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    private void printResult(int[] result, int r) {
        for (int i = 0; i < r; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}