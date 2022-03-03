package level01;

import java.util.*;

public class Report1 {

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        
        int[] answer = Solution(id_list, report, k);
        System.out.println(Arrays.toString(answer));   
    }
    
    public static int[] Solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[] checker = new int[id_list.length];
        ArrayList<String> list = new ArrayList<>(id_list.length);
        for (String name : id_list) {
            list.add(name);
        }
        
        Map<String, Set<String>> map = new HashMap<>();
        for (String str : report) {
            String[] names = str.split(" ");
            Set<String> set = new HashSet<>();
            
            if (!map.containsKey(names[0])) {
                map.put(names[0], set);
            }
            
            if (map.get(names[0]).add(names[1])) {
                checker[list.indexOf(names[1])]++;
            }
        }
        
        for (String key : map.keySet()) {
            for (int i = 0; i < id_list.length; i++) {
                if (checker[i] >= 2) {
                    if (map.get(key).contains(id_list[i])) {
                        answer[list.indexOf(key)]++;
                    }
                }
            }
        }
        
        return answer;
    }

   
}
