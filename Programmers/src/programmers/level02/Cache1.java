package programmers.level02;

import java.util.Arrays;
import java.util.LinkedList;

public class Cache1 {
    public static void main(String[] args) {
        int answer = 0;
        int cacheSize = 5;
        String[] cities = {"a", "b", "c", "b", "a"};
        LinkedList<String> list = new LinkedList<>();

        if (cacheSize == 0) {
            answer = cities.length * 5;
        } else {
            for (int i = 0; i < cities.length; i++) {
                String s = cities[i].toLowerCase();
                if (list.contains(s)) {
                    list.remove(s);
                    list.add(s);
                    answer += 1;
                } else {
                    if (list.size() >= cacheSize) list.remove(0);
                    list.add(s);
                    answer += 5;
                }
            }
        }

        System.out.println(answer);
    }
}
