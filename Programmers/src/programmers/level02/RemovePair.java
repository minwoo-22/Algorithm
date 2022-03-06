package programmers.level02;

import java.util.LinkedList;

public class RemovePair {
    public static void main(String[] args) {
        String s = "baabaa";
        int answer = solution(s);
        System.out.println(answer);
    }
    
    private static int solution(String s) {
        int answer = 0;
        LinkedList<Character> list = new LinkedList<>();
        
        list.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (list.isEmpty()) {
                list.add(s.charAt(i));
            } else {
                if (list.getLast() == s.charAt(i)) list.removeLast();
                else list.add(s.charAt(i));
            }
        }
        
        if (list.size() == 0) answer = 1;
        else answer = 0;
        
        return answer;
    }
}
