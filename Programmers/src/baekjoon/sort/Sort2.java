package baekjoon.sort;

import java.io.*;
import java.util.*;

public class Sort2 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>(N);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for (int n : list) {
            sb.append(n + "\n");
        }
        System.out.println(sb.toString());
    }
}
