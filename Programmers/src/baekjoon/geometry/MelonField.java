package baekjoon.geometry;

import java.io.*;
import java.util.StringTokenizer;

public class MelonField {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        // 면적 당 참외 개수
        int N = Integer.parseInt(br.readLine());
        // 길이를 저장할 배열 (0 ~ 7 인덱스)
        int[] lengths = new int[8];
        // 가로, 세로 최대값
        int horizontalMax = 0;
        int verticalMax = 0;
        // 최대 넓이에서 빼야할 넓이를 구하기 위한 가로, 세로 길이
        int horizontalMinus = 0;
        int verticalMinus = 0;

        for (int i = 1; i < 7; i++) {
            st = new StringTokenizer(br.readLine());
            int direction = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());
            // 북쪽이거나 남쪽이면
            if (direction == 4 || direction == 3) {
                if (distance > horizontalMax) {
                    horizontalMax = distance;
                }
            } else {
                if (distance > verticalMax) {
                    verticalMax = distance;
                }
            }
            lengths[i] = distance;
        }
        // out of index에러가 나지 않게 하기 위해
        lengths[0] = lengths[6];
        lengths[7] = lengths[1];

        for (int i = 1; i < 7; i++) {
            if (lengths[i] == horizontalMax) {
                verticalMinus = verticalMax - Math.min(lengths[i-1], lengths[i+1]);
            }
            if (lengths[i] == verticalMax) {
                horizontalMinus = horizontalMax - Math.min(lengths[i-1], lengths[i+1]);
            }
        }

        // 가로, 세로 최대 길이 넓이를 구한 후 최소 길이 넓이를 뺀게 총 넓이다.
        int totalArea = horizontalMax * verticalMax - horizontalMinus * verticalMinus;
        System.out.println(totalArea * N);
    }
}