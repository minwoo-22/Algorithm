package baekjoon.sort;

import java.io.*;
import java.util.*;

public class Statistics {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] x = new int[N];

        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(br.readLine());
        }
        // 정렬
        Arrays.sort(x);

        StringBuilder sb = new StringBuilder();
        sb.append(avg(x)).append("\n");
        sb.append(x[x.length/2]).append("\n");
        sb.append(maxCnt(x)).append("\n");
        sb.append(x[x.length-1] - x[0]);
        System.out.println(sb.toString());
    }

    static int avg(int[] x) {
        double result = 0;

        for (int n : x) {
            result += n;
        }
        result /= x.length;

        return Integer.parseInt(String.format("%.0f", result));
    }

    static int maxCnt(int[] x) {
        int result = 0;
        // 가장 큰 빈도값
        int maxC = 0;
        // 빈도 수가 동일할 경우 2번째 수를 카운팅 하기 위한 cnt
        int cnt = 0;
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int n : x) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 0);
            }
        }

        Collection<Integer> collection = map.values();
        // maxCnt를 구한다.
        Iterator<Integer> it = collection.iterator();
        maxC = it.next();

        while (it.hasNext()) {
            int nextNum = it.next();
            if (maxC < nextNum) {
                maxC = nextNum;
            }
        }

        for (int n : map.keySet()) {
            if (map.get(n) == maxC) {
                result = n;
                if (cnt == 1) { // 2번째면 반복문 탈출
                    result = n;
                    break;
                }
                cnt++;
            }
        }
        return result;
    }
}
