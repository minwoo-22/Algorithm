package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudyWords {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.toUpperCase();
        
        int cnt = 0;
        int max = 0;
        
        char word = 'A';
        
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < 26; i++) {
            map.put(word++, 0);
        }
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
                // max값 저장
                if (map.get(c) > max) {
                    max = map.get(c);
                }
            }
        }
        
        for (char c : map.keySet()) {
            if (map.get(c) == max) {
                cnt++;
                word = c;
            }
        }
        
        if (cnt >= 2) {
            System.out.println("?");
        } else {
            System.out.println(word);
        }
    }

}
