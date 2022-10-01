package baekjoon.sort;

import java.io.*;
import java.util.*;

public class WordSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        LinkedHashSet<String> set = new LinkedHashSet<>(N);
        String[] words = null;

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
            set.stream().spliterator();
        }

        // set을 array로
        words = new String[set.size()];
        int i = 0;
        for (String str : set) {
            words[i] = str;
            i++;
        }

        // array 정렬
        Arrays.sort(words, (w1, w2) -> {
           if (w1.length() == w2.length()) {
               return w1.compareTo(w2);
           }
           return w1.length() - w2.length();
        });

        // 출력값
        for (String str : words) {
            sb.append(str).append("\n");
        }

        System.out.println(sb.toString());
    }
}