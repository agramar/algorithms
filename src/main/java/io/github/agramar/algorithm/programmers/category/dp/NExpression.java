package io.github.agramar.algorithm.programmers.category.dp;

public class NExpression {
    public int solution(int N, int number) {
        // TODO

        // 더하기
        // 빼기
        // 곱하기
        // 나누기 : 1, 11, 111
        // 1 : N / N
        // 2 : (N + N) / N
        // 3 : (N + N + N) / N
        // 9 : (NN - N - N) / N
        // 10 : (NN - N) / N
        // 11 : NN / N
        // 12 : (NN + N) / N

        // 1번 사용
        // 2번 사용 경우 : 4칙연산,  NN
        // 3번 사용 경우 : 2번사용 경우 * 1번번 사용 경우, NNN

        int[] A = {};
//        Arrays.stream(A).


        int answer = 0;
        return answer;
    }

    
}
