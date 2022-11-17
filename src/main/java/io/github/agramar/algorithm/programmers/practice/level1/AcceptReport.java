package io.github.agramar.algorithm.programmers.practice.level1;

import java.util.*;

public class AcceptReport {
    public int[] solution(String[] id_list, String[] report, int k) {

        Map<String, User> userMap = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            String id = id_list[i];
            userMap.put(id, new User(i, id));
        }

        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        for (String repo : reportSet) {
            String[] users = repo.split(" ");
            String reportUser = users[0];
            String reportedUser = users[1];
            userMap.get(reportUser).addReportUser(reportedUser);
            userMap.get(reportedUser).plusReportCount();
        }

        List<String> bannedUserIds = userMap.values().stream()
                .filter(user -> user.isBanned(k))
                .map(User::getId)
                .toList();

        return userMap.values().stream()
                .sorted(Comparator.comparingInt(User::getIndex))
                .mapToInt(user -> {
                    Set<String> reportUserIds = user.getReportUserIds();
                    int count = 0;
                    for (String reportUserId : reportUserIds) {
                        for (String bannedUserId : bannedUserIds) {
                            if (reportUserId.equals(bannedUserId)) count++;
                        }
                    }
                    return count;
                })
                .toArray();
    }
}


class User {
    private final int index;
    private final String id;
    private final Set<String> reportUserIds = new HashSet<>();
    private int reportedCount = 0;

    public User(int index, String id) {
        this.index = index;
        this.id = id;
    }

    public int getIndex() {
        return index;
    }

    public String getId() {
        return id;
    }

    public Set<String> getReportUserIds() {
        return reportUserIds;
    }

    public void plusReportCount() {
        this.reportedCount++;
    }

    public void addReportUser(String reportUser) {
        this.reportUserIds.add(reportUser);
    }

    public boolean isBanned(int k) {
        return this.reportedCount >= k;
    }

    @Override
    public String toString() {
        return "User{" +
                "index=" + index +
                ", id='" + id + '\'' +
                ", reportUsers=" + reportUserIds +
                ", reportedCount=" + reportedCount +
                '}';
    }
}