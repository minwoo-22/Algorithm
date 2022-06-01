package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringSortAsILike {

    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        String[] answer = solution(strings, n);
        System.out.println(Arrays.toString(answer));
    }
    
    private static String[] solution(String[] strings, int n) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for(int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n)+strings[i]);
        }
        Collections.sort(list);
        
        answer = new String[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }
        
        
        return answer;
    }

}
