package baekjoon.set_map;

import java.io.*;
import java.util.*;

public class ImPocketMonMaster {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, String> map = new HashMap<>();

        int index = 1;
        for (int i = 0; i < N; i++) {
            String monsterName = br.readLine();
            map.put(monsterName, String.valueOf(index));
            map.put(String.valueOf(index), monsterName);
            index++;
        }

        for (int i = 0; i < M; i++) {
            sb.append(map.get(br.readLine())).append("\n");
        }

        System.out.println(sb.toString());
    }
}