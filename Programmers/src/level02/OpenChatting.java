package level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OpenChatting {

    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi"
                , "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo"
                ,"Change uid4567 Ryan"};
        String[] answer = solution(record);
        System.out.println(Arrays.toString(answer));
    }
    
    private static String[] solution(String[] record) {
        Map<String, String> ids = new HashMap<>();
        int size = record.length;
        
        for (String s : record) {
            if (s.substring(0, s.indexOf(" ")).equals("Enter") || s.substring(0, s.indexOf(" ")).equals("Change")) {
                ids.put(s.substring(s.indexOf(" ")+1
                        , s.lastIndexOf(" ")), s.substring(s.lastIndexOf(" "), s.length()));
                if (s.substring(0, s.indexOf(" ")).equals("Change")) size--;
            }
        }
        
        String[] answer = new String[size];
        ArrayList<String> list = new ArrayList<>();
        
        String io = "";
        String name = "";
        for (int i = 0; i < record.length; i++) {
            io = record[i].substring(0, record[i].indexOf(" "));
            
            if (io.equals("Enter")) {
                name = record[i].substring(record[i].indexOf(" ")+1,
                        record[i].lastIndexOf(" "));
                list.add(ids.get(name)+"님이 들어왔습니다.");
            } else if (io.equals("Leave")) {
                name = record[i].substring(record[i].indexOf(" ")+1,
                        record[i].length());
                list.add(ids.get(name)+"님이 나갔습니다.");
            } 
        }
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i).trim();
        }
        return answer;
    }

}
