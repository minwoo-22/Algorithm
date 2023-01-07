package baekjoon.numberTheory;

import java.io.*;
import java.util.*;

public class FashionKing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = null;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            map = new HashMap<>();
            // 경우의 수
            int count = 1;
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String costumeType = st.nextToken();
                map.put(costumeType, map.getOrDefault(costumeType, 1) + 1);
            }
            int mapSize = map.size();
            for (String name : map.keySet()) {
                count *= map.get(name);
            }
            // 모두 입지 않는 경우의 수를 빼야됨
            sb.append(count-1).append("\n");
        }

        System.out.println(sb.toString());
    }
}
