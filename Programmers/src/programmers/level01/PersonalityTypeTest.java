package programmers.level01;

import java.util.HashMap;
import java.util.Map;

public class PersonalityTypeTest {
    public static void main(String[] args) {
        String[] survey = {"TR", "RT", "TR"};
        int[] choices = {7, 1, 3};
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        String[] personality = {"RT", "CF", "JM", "AN"};

        for (int i = 0; i < survey.length; i++) {
            String s = survey[i];
            String first = String.valueOf(survey[i].charAt(0));
            String second = String.valueOf(survey[i].charAt(1));
            int c = choices[i];

            switch (c) {
                case 1:
                    map.put(first, map.getOrDefault(first, 0) + 3);
                    break;
                case 2:
                    map.put(first, map.getOrDefault(first, 0) + 2);
                    break;
                case 3:
                    map.put(first, map.getOrDefault(first, 0) + 1);
                    break;
                case 5:
                    map.put(second, map.getOrDefault(second, 0) + 1);
                    break;
                case 6:
                    map.put(second, map.getOrDefault(second, 0) + 2);
                    break;
                case 7:
                    map.put(second, map.getOrDefault(second, 0) + 3);
                    break;
            }
        }

        for (int i = 0; i < personality.length; i++) {
            String first = String.valueOf(personality[i].charAt(0));
            String second = String.valueOf(personality[i].charAt(1));
            // 설문지에 없던 값도 0으로 세팅
            map.put(first, map.getOrDefault(first, 0));
            map.put(second, map.getOrDefault(second, 0));
            if (map.get(first) >= map.get(second)) {
                sb.append(first);
            } else {
                sb.append(second);
            }
        }

        System.out.println(sb.toString());
    }
}
