package baekjoon.set_map;

import java.io.*;
import java.util.*;

public class NumberCard2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int cardNumber = Integer.parseInt(st.nextToken());
            map.put(cardNumber, map.getOrDefault(cardNumber, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int checkNumber = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(checkNumber, 0)).append(" ");
        }

        System.out.println(sb.toString());
    }
}