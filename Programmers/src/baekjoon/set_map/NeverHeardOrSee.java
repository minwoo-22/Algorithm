package baekjoon.set_map;

import java.io.*;
import java.util.*;

public class NeverHeardOrSee {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        // 듣도 못한 사람을 담을 set
        Set<String> neverHeard = new HashSet<>();
        // 듣도 보도 못한 사람을 담을 queue
        PriorityQueue<String> neverHeardSee = new PriorityQueue<>();
        // 듣도 보도 못한 사람 수
        int count = 0;

        for (int i = 0; i < N; i++) {
            neverHeard.add(br.readLine());
        }

        for (int i = 1; i < M; i++) {
            String name = br.readLine();
            if (neverHeard.contains(name)) {
                neverHeardSee.add(name);
                count++;
            }
        }

        sb.append(count).append("\n");
        while (!neverHeardSee.isEmpty()) {
            sb.append(neverHeardSee.poll()).append("\n");
        }

        System.out.println(sb.toString());
    }
}