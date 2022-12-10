package baekjoon.set_map;

import java.io.*;
import java.util.*;

public class NumberCard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            if (set.add(Integer.parseInt(st.nextToken()))) {
                sb.append("0").append(" ");
            } else {
                sb.append("1").append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}