package programmers.level01;

import java.util.LinkedList;
import java.util.List;

public class Ternary {

    public static void main(String[] args) {
        int n = 45;
        System.out.println(solution(n));
    }
    private static int solution(int n) {
        int answer = 0;
        List<Integer> list = new LinkedList<>();
        
        while(true) {
            list.add(n % 3);
            if (n / 3 == 0) break;
            n = n / 3;
        }
        
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i) * Math.pow(3, list.size()-1-i);
        }
        return answer;
    }
    
}
