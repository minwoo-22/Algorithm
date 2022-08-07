package baekjoon.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OvenClock {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int time = Integer.parseInt(br.readLine());
        int timeH = time / 60;
        int timeM = time % 60;
        
        // 분이 60을 넘어갈 때와 넘어가지 않을 때
        if (M + timeM >= 60) {
            H = H + timeH + 1;
            M = (M + timeM) % 60;
        } else {
            H += timeH;
            M += timeM;
        }
        
        System.out.println((H % 24) + " " + M);
    }

}
