package kr.co.agramar.programmers.test.level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HardDisk {



    public int solution(int[][] jobs) {
        int answer = 0;


        int processTime = 0;
        List<int[]> jobList = new ArrayList<>(Arrays.asList(jobs));

        return answer;
    }


    /**
     * 선택된 잡의 인덱스 반환
     * 다음 잡 기준 :
     * 대기시간 + 완료시간 젤 짧은거
     * 없으면 젤 빠른거중에 젤 짧은거
     */
    public int findNextJob(List<int[]> jobs, int processTime) {


        //
        Integer jobIndex = null;
        for (int i = 0; i < jobs.size() ; i++) {
            int requestTime = jobs.get(i)[0];
            if (processTime <= requestTime) {
                continue;
            }
            int jobAmount = jobs.get(i)[1] - requestTime;
        }

        // 젤 빠른거
        if (jobIndex == null) {

            int fastestIndex = 0;
            int fastestStart = 0;
            for (int i = 0; i < jobs.size() ; i++) {


                int requestTime = jobs.get(i)[0];
                int jobAmount = jobs.get(i)[1] - requestTime;
            }
        }

        return jobIndex;
    }

}
