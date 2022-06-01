package programmers.level01;

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
        Map<Integer, Boolean> map = new HashMap<>();
        int check = 0;
        int zero = 0;
        
        for (int lotto : lottos) {
            if (lotto == 0) {
                zero++;
                continue;
            }
            map.put(lotto, true);
        }
        
        for (int win : win_nums) {
            if (map.containsKey(win)) check++;
        }
        int top = 7 - (check+zero);
        int low = 7 - check;
        if (top > 7) top = 6;
        if (low > 7) low = 6;
        
        return new int[]{top, low};
    }
    
}
