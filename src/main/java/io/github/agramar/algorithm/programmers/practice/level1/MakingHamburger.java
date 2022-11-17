package io.github.agramar.algorithm.programmers.practice.level1;

public class MakingHamburger {

    public int solution(int[] ingredient) {
        int answer = 0;

        StringBuilder build = new StringBuilder();

        for (int j : ingredient) {
            build.append(j);
            if (build.length() > 3 && build.subSequence(build.length() - 4, build.length()).equals("1231")) {
                answer++;
                build.delete(build.length() - 4, build.length());
            }
        }

        return answer;
    }
}
