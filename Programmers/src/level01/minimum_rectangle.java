package level01;

import java.util.Arrays;

public class minimum_rectangle {
    public static void main(String[] args) {
        int[][] sizes = {{60,50}, {30,70}, {60,30}, {80,40}};
        int result = solution(sizes);
        System.out.println(result);
    }
    
    private static int solution(int[][] sizes) {
        int answer = 0;
        
        int maxX = sizes[0][0];
        int maxY = sizes[0][1];
        for (int i = 1; i < sizes.length; i++) {
            int tempX = maxX;
            int tempY = maxY;
            
            // 안 뒤집었을 때
            if (maxX < sizes[i][0]) {
                maxX = sizes[i][0];
            }
            if (maxY < sizes[i][1]) {
                maxY = sizes[i][1];
            }
            int result1 = maxX * maxY;
            System.out.println("result1 : " + result1);
            
            // 뒤집었을 떼
            int temp = sizes[i][0];
            sizes[i][0] = sizes[i][1];
            sizes[i][1] = temp;
            if (tempX < sizes[i][0]) {
                maxX = sizes[i][0];
            } else {
                maxX = tempX;
            }
            if (tempY < sizes[i][1]) {
                maxY = sizes[i][1];
            } else {
                maxY = tempY;
            }
            int result2 = maxX * maxY;
            System.out.println("result2 : " + result2);
            
            // 뒤집은 경우가 더 크면 뒤집기 전으로 모든 값을 되돌림
            if (result1 < result2) {
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
                maxX = tempX;
                maxY = tempY;
            }
            System.out.printf("%d x %d = %d\n", maxX, maxY, maxX*maxY);
        }
        
        maxX = sizes[0][0];
        maxY = sizes[0][1];
        for (int i = 1; i < sizes.length; i++) {
            if (maxX < sizes[i][0]) maxX = sizes[i][0];
            if (maxY < sizes[i][1]) maxY = sizes[i][1];
        }
        answer = maxX * maxY;
        return answer;
    }
    
}
