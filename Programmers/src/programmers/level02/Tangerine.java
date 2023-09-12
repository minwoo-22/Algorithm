package programmers.level02;

import java.util.*;

public class Tangerine {
    public static void main(String[] args) {
        int[] tangerine = {1, 1, 1, 1, 2, 2, 2, 3};
        int k = 2;
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i]
                    , map.getOrDefault(tangerine[i], 0) + 1);
        }
        Set<Integer> set = map.keySet();
        ArrayList<Integer> list = new ArrayList<>(set.size());
        for (Integer key : set) {
            list.add(map.get(key));
        }
        Collections.sort(list, (o1, o2) -> (o2 - o1));

        for (int i = 0; i < list.size(); i++) {
            k -= list.get(i);
            answer++;
            if (k <= 0) break;
        }
        System.out.println(answer);
    }
}
