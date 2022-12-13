package baekjoon.geometry;

import java.io.*;
import java.util.StringTokenizer;

public class Escape {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int min = Math.min(Math.min(x, w-x), Math.min(y, h-y));

        System.out.println(min);
    }
}