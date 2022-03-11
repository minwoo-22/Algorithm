package programmers.level02;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class NewsClustering {
    public static void main(String[] args) {
        String str1 = "FRANCE";
        String str2 = "FRANCE_";
        int answer = solution(str1, str2);
        System.out.println(answer);
    }
    
    static int solution(String str1, String str2) {
        int answer = 0;
        ArrayList<String> str1Arr = new ArrayList<>();
        ArrayList<String> str2Arr = new ArrayList<>();
        int union = 0;  //합집합
        int intersection = 0;   //교집합
        char a;
        char b;
        
        
        for (int i = 0; i < str1.length()-1; i++) {
            a = str1.charAt(i);
            if (a < 'A' || a > 'z' || a == '_') continue;
            b = str1.charAt(i+1);
            if (b < 'A' || b > 'z' || b == '_') continue;
            
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(b);
            str1Arr.add(sb.toString().toUpperCase());
        }
        
        for (int i = 0; i < str2.length()-1; i++) {
            a = str2.charAt(i);
            if (a < 'A' || a > 'z' || a == '_') continue;
            b = str2.charAt(i+1);
            if (b < 'A' || b > 'z' || b == '_') continue;
            
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(b);
            str2Arr.add(sb.toString().toUpperCase());
        }
        
        // 모두 공집합일 때
        if (str1Arr.size() == 0 && str2Arr.size() == 0) {
            return 65536;
        }
        
        union = str1Arr.size()+str2Arr.size();
        
        for (int i = 0; i < str1Arr.size(); i++) {
            if (str2Arr.contains(str1Arr.get(i))) {
                str2Arr.remove(str1Arr.get(i));
                intersection++;
            }
        }
        union -= intersection;
        
        double result = ((double)intersection/union)*65536.0;

        answer = (int)result;
        return answer;
    }
}
