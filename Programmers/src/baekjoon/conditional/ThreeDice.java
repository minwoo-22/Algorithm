package baekjoon.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ThreeDice {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 주사위 숫자(1 ~ 6)
        int[] dice = new int[7];
        // 주사위 값
        int[] diceNum = new int[3];
        // 점수
        int point = 0;
        // 최대값
        int max = 0;
        
        for (int i = 0; i < diceNum.length; i++) {
            diceNum[i] = Integer.parseInt(st.nextToken());
            dice[diceNum[i]]++;
        }
        
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 3) {
                point = 10000 + i * 1000;
                break;
            } else if (dice[i] == 2) {
                point = 1000 + i * 100;
                break;
            } else if (dice[i] == 1) {
                if (i > max) {
                    max = i;
                }
            }
        }
        
        if (point < (max * 100)) {
            point = max * 100;
        }
        System.out.println(point);
    }

}
