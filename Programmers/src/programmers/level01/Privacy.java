package programmers.level01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Privacy {
    public static void main(String[] args) {
        String today = "2020.01.01";
        String[] terms = {"Z 3", "D 5"};
        String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        Map<String, String> termsMap = new HashMap<>();
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < terms.length; i++) {
            String[] term = terms[i].split(" ");
            termsMap.put(term[0], term[1]);
        }
        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            int duration = Integer.parseInt(termsMap.get(privacy[1]));
            String registDate = privacy[0];

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");

            // 날짜 문자열을 LocalDate로 변환
            LocalDate todayByFormat = LocalDate.parse(today, formatter);
            LocalDate registDateByFormat = LocalDate.parse(registDate, formatter);

            // 두 날짜 사이의 월 수 계산
            long monthsBetween = ChronoUnit.MONTHS.between(registDateByFormat, todayByFormat);

            if (monthsBetween >= duration) {
                answer.add(i+1);
            }
        }

        System.out.println(answer);
    }
}
