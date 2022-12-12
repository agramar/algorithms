package io.github.agramar.algorithm.programmers.exam.level3;

import java.util.*;

public class MatchingPoint {
    public int solution(String word, String[] pages) {

        List<Page> pageList = new ArrayList<>();
        for (int i = 0; i < pages.length; i++) {
            Page page = new Page(i);
            page.analyzePage(word, pages[i]);
            pageList.add(page);
        }

        for (Page page : pageList) {
            for (Page page1 : pageList) {
                page.addLinkPoint(page1.getOuterLinkPoint(page.getUrl()));
            }
        }

        return pageList.stream().max((o1, o2) -> {
            int compare = Double.compare(o1.getPoint(), o2.getPoint());
            if (compare != 0) return compare;
            return Integer.compare(o2.getIndex(), o1.getIndex());
        }).orElse(new Page(0)).getIndex();
    }
}

class Page {
    private int index;
    private int wordCount;
    private String url;
    private Map<String, Integer> outerLinkCountMap;
    private int linkCount;
    private double linkPoint = 0;

    Page(int index) {
        this.index = index;
    }

    void analyzePage(String word, String page) {
        this.wordCount = findWordCount(word, page);
        this.url = findUrl(page);
        this.outerLinkCountMap = findOuterLinkCountMap(page);
    }

    int getIndex() {
        return index;
    }

    String getUrl() {
        return url;
    }

    double getPoint() {
        return this.wordCount + this.linkPoint;
    }

    int getOuterLinkPoint(String url) {
        if (this.linkCount == 0) return 0;
        return outerLinkCountMap.getOrDefault(url, 0) / this.linkCount;
    }

    void addLinkPoint(int linkPoint) {
        this.linkPoint += linkPoint;
    }


    private int findWordCount(String word, String page) {
        String[] words = page.split("[^a-zA-Z]");
        return (int) Arrays.stream(words).filter(w -> w.equalsIgnoreCase(word)).count();
    }

    private String findUrl(String page) {
        int metaTagStartIndex = page.indexOf("<meta property=\"og:url\"");
        String meta = page.substring(metaTagStartIndex);
        String removeEndTag = meta.substring(0, meta.indexOf("\"/>"));
        int contentAttrIndex = removeEndTag.indexOf("content=\"");
        return removeEndTag.substring(contentAttrIndex + 9);
    }

    private Map<String, Integer> findOuterLinkCountMap(String page) {
        Map<String, Integer> map = new HashMap<>();
        String[] lines = page.split("\n");
        for (String line : lines) {
            if (!line.startsWith("<a href=\"https://")) {
                continue;
            }
            String link = line.substring(line.indexOf("\"") + 1, line.lastIndexOf("\""));
            int linkMapCount = map.getOrDefault(link, 0);
            map.put(link, ++linkMapCount);
            this.linkCount++;
        }
        return map;
    }
}