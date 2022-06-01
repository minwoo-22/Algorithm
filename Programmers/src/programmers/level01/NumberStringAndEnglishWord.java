package programmers.level01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NumberStringAndEnglishWord {
    public static void main(String[] args) {
        int result = solution("one4seveneight");
        System.out.println(result);
    }
    
    private static int solution(String s) {
        Map<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        
        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext()) {
//            System.out.println("it : " + it.next());
            String number = it.next();
            s = s.replaceAll(number, map.get(number));
            System.out.println(s);
        }
        
        
        int answer = Integer.parseInt(s);
        return answer;
    }
}
