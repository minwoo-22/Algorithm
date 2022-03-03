package level01;

import java.util.HashMap;
import java.util.Map;

public class Lotto {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win = {31, 10, 45, 1, 6, 19};
        int[] answer = solution(lottos, win);
        for(int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
        }
    }
    
    
    public static int[] solution(int[] lottos, int[] win_nums) {
        int check = 0;
        int zero = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) {
                    check++;
                } else if (lottos[i] == 0) {
                    zero++;
                    break;
                }
            }
        }
        int top = 0;
        int low = 0;
        switch(check+zero) {
            case 6:
                top = 1;
                low = top+zero;
                break;
            case 5:
                top = 2;
                low = top+zero;
                break;
            case 4:
                top = 3;
                low = top+zero;
                break;
            case 3:
                top = 4;
                low = top+zero;
                break;
            case 2:
                top = 5;
                low = top+zero;
                break;
            case 1:
                top = 6;
                low = top+zero;
                break;
            case 0:
                top = 6;
                low = 6;
                break;
            
        }
        if (low > 6) low = 6;
        int[] answer = {top, low};
        return answer;
    }
    
}
