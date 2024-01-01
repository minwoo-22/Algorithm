package programmers.level02;

import java.util.*;

public class Compression {
    public static void main(String[] args) {
        String msg = "ABABABABABABABAB";
        Map<String, Integer> dictionary = new HashMap<>();
        List<Integer> answerList = new LinkedList<>();

        char firstChar = 'A';
        int dicIndex = 1;
        for (; dicIndex <= 26; dicIndex++) {
            dictionary.put(String.valueOf(firstChar), dicIndex);
            firstChar++;
        }

        int firstIndex = 0;
        for (int i = 1; i <= msg.length(); i++) {
            String dicKey = msg.substring(firstIndex, i);
            if (!dictionary.containsKey(dicKey)) {
                dictionary.put(dicKey, dicIndex++);
                String insertKey = msg.substring(firstIndex, i - 1);
                answerList.add(dictionary.get(insertKey));
                firstIndex = i - 1;
                i--;
            }

            if (i == msg.length()) {
                answerList.add(dictionary.get(dicKey));
            }
        }

        System.out.println(answerList);
    }
}
