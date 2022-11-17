package io.github.agramar.algorithm.programmers.exam.level2;

public class Solution1 {
    public int solution(String s) {
        System.out.println("=============");
        System.out.println(s + "|" + s.length());

        int shortestLength = s.length();
        for (int per = 1; per < (s.length() / 2) + 1; per++) {

            String standard = "";
            int currentLength = 0;
            int sameCount = 0;
            for (int i = 0; i < s.length(); i += per) {

                // 마지막 짜투리는 그냥 추가
                if (s.length() < i + per) {
                    String last = s.substring(i);
                    currentLength += last.length();
                    break;
                }


                String target = s.substring(i, i + per);
                if (standard.equals(target)) {
                    // 기준과 같을경우 압축 카운트 올림
                    sameCount++;
                } else {
                    // 기준과 다를경우 기준값을 변경후
                    standard = target;
                    // 이전 압축값 계산해서 카운트 추가
                    currentLength += target.length();
                    if (sameCount > 0) {
                        currentLength++;
                    }
                    sameCount = 0;
                }
            }

            System.out.println(per + "|" + currentLength);
        }

        System.out.println("=============");

        return shortestLength;
    }
}
