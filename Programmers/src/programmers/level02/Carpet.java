package programmers.level02;

import java.util.Arrays;

public class Carpet {

    public static void main(String[] args) {
        int brown = 18;
        int yellow = 6;
        int[] result = solution(brown, yellow);
        System.out.println(Arrays.toString(result));
    }
    
    private static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int cnt = brown + yellow;
        
        // 가로, 세로의 최소값 3
        int x = 3;
        int y = 3;
        int totalCnt = x * y;
        
        while (totalCnt != cnt) {
            x++;
            for (int i = y; i <= x; i++) {
                if (x*i > cnt) {
                    break;
                } else if (x*i == cnt && (x-2)*(i-2) == yellow) {   // 갈색이 노란색을 감싸고 있어야 하기 때문에
                    y = i;
                    break;
                }
            }
            totalCnt = x * y;
        }
        
        answer[0] = x;
        answer[1] = y;
        return answer;
    }

}
