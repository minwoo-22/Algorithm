package baekjoon.sort;

import java.io.*;
import java.util.*;

public class CoordinateSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = null;

        SortedMap<Integer, List<Integer>> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            List<Integer> list = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            int key = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());

            // key가 존재하면 key에 해당하는 list를 꺼내서 value값을 추가한다.
            if (map.containsKey(key)) {
                list = map.get(key);
            }
            list.add(value);
            map.put(key, list);
        }

        for (int key : map.keySet()) {
            // key가 가지고 있는 values
            List values = map.get(key);
            // values 정렬
            Collections.sort(values);
            for (int i = 0; i < values.size(); i++) {
                sb.append(key + " " + values.get(i)).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
