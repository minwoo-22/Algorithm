package programmers.level02;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Printer {

    public static void main(String[] args) {
        int[] priorities = {1,1,9,1,1,1};
        int location = 0;
        int answer = solution(priorities, location);
        System.out.println(answer);
    }
    
    static int solution(int[] priorities, int location) {
        int answer = 0;
        int[] arr = priorities.clone();
        Arrays.sort(arr);
        Queue<Integer> q = new LinkedList<>();
        
        for(int n : priorities) {
            q.add(n);
        }
        
        int k = arr.length-1;
        while (!q.isEmpty()) {
            int number = q.poll();
            if (number < arr[k] && k >= 0) {
                q.add(number);
                location -= 1;
                if (location < 0) location = priorities.length-1-answer;
            } else if (number >= arr[k] && k >= 0){
                answer++;
                k--;
                if (location == 0) {
                    break;
                }
                location -= 1;
                if (location < 0) location = priorities.length-1-answer;
            }
            
        }
        
        return answer;
    }

}
