package programmers.level02;

import java.util.HashMap;

public class PhoneNumbers {

    public static void main(String[] args) {
        String[] phone_book = {"12", "123", "1235", "567", "88"};
        boolean answer = solution(phone_book);
        System.out.println(answer);
    }
    
    private static boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }
        
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 1; j < phone_book[i].length(); j++) {
                if (map.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }
        
        return answer;
    }

}
