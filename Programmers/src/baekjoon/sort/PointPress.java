package baekjoon.sort;

import java.io.*;
import java.util.*;

public class PointPress {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        // 중복 없고 오름차순 정렬하기 위한 TreeSet
        TreeSet<Integer> set = new TreeSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(st.nextToken());
            set.add(number);
            numbers[i] = number;
        }

        Iterator<Integer> it = set.iterator();
        for (int i = 0; i < set.size(); i++) {
            map.put(it.next(), i);
        }

        for (int n : numbers) {
            sb.append(map.get(n)).append(" ");
        }
        System.out.println(sb.toString());
    }
}