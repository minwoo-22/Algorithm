package programmers.level01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Failure {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(solution(N, stages)));
    }
    private static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        // 클리어 하지 못한 플레이어 수
        int[] player = new int[N+1];
        // 해당 스테이지에 있거나 이미 클리어한 유저 수
        int[] all_player = new int[N+1];
        // 실패율
        double[] failure = new double[N+1];
        
        // 클리어 하지 못한 유저 수
        for (int i = 0; i < stages.length; i++) {
            if (stages[i] < N+1) {
                player[stages[i]]++;
            }
        }
        
        // 해당 스테이지를 지나갔거나 머물러 있는 유저 수
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (i <= stages[j]) {
                    all_player[i]++;
                }
            }
        }
        for (int i = 1; i <= N; i++) {
            if (all_player[i] != 0) {
                failure[i] = (double) player[i]/all_player[i];
            } else {
                failure[i] = 0;
            }
        }

        double max = -1;
        int index = 0;
        for (int i = 0; i < answer.length; i++) {
            index = i;
            for (int j = 1; j < failure.length; j++) {
                if (failure[j] == -1) continue;
                if (failure[j] > max) {
                    max = failure[j];
                    index = j;
                }
            }
            failure[index] = -1;
            answer[i] = index;
            max = -1;
        }

        
        
        return answer;
    }
}
