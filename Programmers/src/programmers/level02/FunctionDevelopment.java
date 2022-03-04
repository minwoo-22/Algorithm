package programmers.level02;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionDevelopment {

    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        int[] answer = solution(progresses, speeds);
        System.out.println(Arrays.toString(answer));
    }
    
    private static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int[] days = new int[progresses.length];
        
        int day = 0;    // 날짜
        
        ArrayList<Integer> list = new ArrayList<>();
        int data = 1;   // 리턴할 데이터 값

        for (int i = 0; i < progresses.length; i++) {
            while(progresses[i] < 100) {
                progresses[i] += speeds[i];
                day++;
            }
            days[i] = day;
            day = 0;
        }
        System.out.println(Arrays.toString(days));
        int max = days[0];
        for (int i = 1; i < days.length; i++) {
            if (max < days[i]) {
                max = days[i];
                list.add(data);
                data = 1;
            } else {
                data++;
            }
            
            if (i == days.length-1) list.add(data);
        }
        
        answer = new int[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

}
