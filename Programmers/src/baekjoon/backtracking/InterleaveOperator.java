package baekjoon.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class InterleaveOperator {
    static int MAX = Integer.MIN_VALUE;
    static int MIN = Integer.MAX_VALUE;
    static int N;
    static int[] arr;
    static int[] operator = new int[4];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 숫자의 개수
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        // 각 숫자를 arr 배열에 담는다.
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 각 연산자의 개수를 operator 배열에 담는다. (더하기 0, 빼기 1, 곱하기 2, 나누기 3)
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        dfs(arr[0], 1);

        sb.append(MAX).append("\n").append(MIN);
        System.out.println(sb.toString());
    }

    private static void dfs(int num, int index) {

        if (index == N) {
            MAX = Math.max(num, MAX);
            MIN = Math.min(num, MIN);
           return;
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {
                operator[i]--;

                switch (i) {
                    case 0:
                        dfs(num + arr[index], index + 1);
                        break;
                    case 1:
                        dfs(num - arr[index], index + 1);
                        break;
                    case 2:
                        dfs(num * arr[index], index + 1);
                        break;
                    case 3:
                        dfs(num / arr[index], index + 1);
                        break;

                }

                operator[i]++;
            }
        }

    }
}
