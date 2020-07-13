package kr.co.agramar.hackerrank.warmup;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CompareTheTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int aPoint = 0;
        int bPoint = 0;

        List<Integer> abPoints = new ArrayList<>(2);

        int size = a.size();
        if (a.size() > b.size()) {
            size = b.size();
        }

        for (int i = 0; i < size; i++) {
            if (a.get(i).compareTo(b.get(i)) > 0) aPoint++;
            if (b.get(i).compareTo(a.get(i)) > 0) bPoint++;
        }

        abPoints.add(aPoint);
        abPoints.add(bPoint);

        return abPoints;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}