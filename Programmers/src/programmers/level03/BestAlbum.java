package programmers.level03;

import java.util.*;
import java.util.stream.Collectors;

public class BestAlbum {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        List<Integer> result = solution(genres, plays);
        for (Integer n : result) {
            System.out.println(n);
        }
    }

    private static List<Integer> solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> playSum = new HashMap<>();
        Map<String, Map<Integer, Integer>> mapData = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            // 총 재생 횟수 저장
            playSum.put(genre, playSum.getOrDefault(genre, 0) + play);
            // 노래의 장르, 고유번호, 재생횟수 저장
            mapData.computeIfAbsent(genre, map -> new HashMap<>()).put(i, play);
        }
        // 총 반복 횟수 큰 순서대로 정렬
        List<Map.Entry<String, Integer>> popularList = new ArrayList<>(playSum.entrySet());
        popularList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (int i = 0; i < popularList.size(); i++) {
            String genre = popularList.get(i).getKey();
            Map<Integer, Integer> numberAndPlay = mapData.get(genre);

            List<Integer> top2Keys = numberAndPlay.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .limit(2)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());

            answer.addAll(top2Keys);
        }

        return answer;
    }
}
