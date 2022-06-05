package programmers.level02;

import java.util.LinkedList;
import java.util.Queue;

public class Truck {

    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        
        int result = solution(bridge_length, weight, truck_weights);
        System.out.println(result);
    }
    
    private static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        
        // 현재 다리 위에 올라가 있는 트럭들의 총 무게
        int totalWeight = 0;
        // 총 트럭 수
        int i = 0;
        
        while (true) {
            if (q.size() <= bridge_length) {     // 다리에 트럭이 없거나 트럭이 다리에 올라갈 수 있는 여유가 있을 때
                if (q.size() == bridge_length) {                
                    // 트럭이 다리에 들어가기 전 꽉 차있으면 맨 앞 트럭이 다리를 완전히 지나간다
                    totalWeight -= q.poll();
                }
                
                if (totalWeight + truck_weights[i] <= weight) {  // 트럭이 다리 위에 올라갈 수 있는 경우
                    totalWeight += truck_weights[i];
                    q.add(truck_weights[i]);
                    answer++;
                    i++;
                    
                    // 마지막 트럭이 올라가면 다리위에 올라갈 수 있는 최대 트럭 수를 더해주고 반복문을 빠져나온다.
                    if (i == truck_weights.length) {
                        answer += bridge_length;
                        break;
                    }
                } else {                                        // 트럭이 무게 때문에 다리에 올라가지 못 하는 경우
                    q.add(0);
                    answer++;
                }
            }
        }
        
        return answer;
    }

}
