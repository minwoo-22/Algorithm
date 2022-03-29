package programmers.level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Tuple {
    public static void main(String[] args) {
        String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
        int[] answer = solution(s);
        System.out.println(Arrays.toString(answer));
    }
    
    static int[] solution(String s) {
        // 맨앞 {{, 맨뒤 }}, 사이},{ 제거
        s = s.substring(2, s.length()-2).replace("},{", "-");
        
        String[] arr = s.split("-");
        
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        
        ArrayList<Integer> list = new ArrayList<>();
        for (String temp : arr) {
            String[] val = temp.split(",");     //숫자만
            
            for (int i = 0; i < val.length; i++) {
                int num = Integer.valueOf(val[i]);
                
                if (!list.contains(num)) {
                    list.add(num);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
