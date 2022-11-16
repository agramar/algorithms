package kr.co.agramar.programmers.practice.level1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AcceptReportTest {

    AcceptReport acceptReport = new AcceptReport();

    @Test
    void case1() {
        String[] idList = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

        int[] result = acceptReport.solution(idList, report, k);

        assertEquals(List.of(2, 1, 1, 0), Arrays.stream(result).boxed().toList());
    }

    @Test
    void case2() {
        String[] idList = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;

        int[] result = acceptReport.solution(idList, report, k);

        assertEquals(List.of(0, 0), Arrays.stream(result).boxed().toList());
    }
}