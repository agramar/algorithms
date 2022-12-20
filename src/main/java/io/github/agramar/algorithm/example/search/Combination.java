package io.github.agramar.algorithm.example.search;

/**
 * 조합 : n 개의 원소 중에서 r 개의 원소를 순서는 고려하지 않고 뽑는 경우
 */
public class Combination {

    /**
     * 백트래킹을 이용한 조합
     */
    public void combinationByBackTracking(int[] arr, boolean[] visited, int start, int r) {
        if (r == 0) {
            printResult(arr, visited);
            return;
        }

        for (int i = start; i < arr.length; i++) {
            visited[i] = true;
            combinationByBackTracking(arr, visited, i + 1, r - 1);
            visited[i] = false;
        }
    }

    /**
     * 재귀를 이용한 조합
     */
    public void combinationByRecurrence(int[] arr, boolean[] visited, int depth, int r) {
        if (r == 0) {
            printResult(arr, visited);
            return;
        }

        if (depth == arr.length) {
            return;
        }

        visited[depth] = true;
        combinationByRecurrence(arr, visited, depth + 1, r - 1);

        visited[depth] = false;
        combinationByRecurrence(arr, visited, depth + 1, r);
    }

    // 배열 출력
    private void printResult(int[] arr, boolean[] visited) {
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
