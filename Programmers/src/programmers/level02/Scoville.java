package programmers.level02;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Scoville {
    public static void main(String[] args) {
        int[] scoville = {1,2,3,9,10,12};
        int K = 7;
        int answer = solution(scoville, K);
        System.out.println(answer);
    }
    
    private static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int s : scoville) {
            heap.offer(s);
        }
        
        while (heap.peek() < K) {
            if (heap.size() == 1) return -1;    //끝까지 안만들어지는 경우
            int a = heap.poll();
            int b = heap.poll();
            
            int sco = a + (b * 2);
            heap.offer(sco);
            answer++;
        }
        
        return answer;
    }
}
