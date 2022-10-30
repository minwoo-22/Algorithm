package baekjoon.oneDarray;

import java.io.*;
import java.util.*;

public class Numbering {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>(10);
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        int number = Integer.parseInt(br.readLine());
        for (int num : list) {
            if (number == num) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}