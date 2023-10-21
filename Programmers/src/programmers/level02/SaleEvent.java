package programmers.level02;

import java.util.HashMap;
import java.util.Map;

public class SaleEvent {
    public static void main(String[] args) {
        String[] want = {
                "banana", "apple", "rice", "pork", "pot"
        };
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {
                "chicken", "apple", "apple", "banana", "rice"
                , "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"
        };
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> wantCount = new HashMap<>();
            wantCount.putAll(map);
            boolean isOk = true;
            for (int j = i; j < 10 + i; j++) {
                if (wantCount.containsKey(discount[j])) {
                    wantCount.put(discount[j], wantCount.get(discount[j]) - 1);
                    if (wantCount.get(discount[j]) < 0) break;
                }
            }
            for (Integer count : wantCount.values()) {
                if (count != 0) {
                    isOk = false;
                    break;
                }
            }
            if (isOk) answer++;
        }

        System.out.println(answer);
    }
}
