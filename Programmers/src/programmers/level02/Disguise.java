package programmers.level02;

import java.util.HashMap;
import java.util.Map;

public class Disguise {
    public static void main(String[] args) {
        String[][] clothes = {
                {"yellowhat", "headgear"},
                {"bluesunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };
        int result = solution(clothes);
        System.out.println(result);
    }
    
    private static int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
            if (!map.containsKey(clothes[i][1])) {       //해당 옷 종류가 처음이면 map에 짚어넣고 count를 2로 해준다. 
                map.put(clothes[i][1], 2);              //(이 옷 종류를 선택하지 않는 경우의 수도 계산해야 하기 때문에 2로 해줘야 한다.)
            } else {
                map.put(clothes[i][1], map.get(clothes[i][1])+1);
            }
        }
        
        //경우의 수 계산
        for (int cnt : map.values()) {
            answer *= cnt;
        }
        
        //결과값에서 1을 빼는 이유는 하나도 입지 않았을 경우의 수가 포함되어 있기 때문이다. (문제에서는 최소 하나 이상의 옷을 입어야 한다고 조건이 주어짐.)
        answer -= 1;
        
        return answer;
    }
}
