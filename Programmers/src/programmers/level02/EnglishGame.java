package programmers.level02;

import java.util.ArrayList;
import java.util.List;

public class EnglishGame {
    public static void main(String[] args) {
        int[] answer = new int[2];
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
        int n = 2;
        // 사용한 단어 담는 리스트
        List<String> usedWord = new ArrayList<>(words.length);

        String oldWord = words[0];
        usedWord.add(oldWord);
        for (int i = 1; i < words.length; i++) {
            String newWord = words[i];
            // 중복 단어면 아웃
            if (usedWord.contains(newWord)) {
                break;
            }
            // 이전 문자의 끝 알파벳
            char end = oldWord.charAt(oldWord.length()-1);
            // 새로운 단어의 첫 번째 알파벳
            char first = newWord.charAt(0);
            // 둘이 다르면 아웃
            if (end != first) {
                break;
            }
            usedWord.add(newWord);
            oldWord = newWord;
        }

        // 아무도 실패하지 않았을 경우
        if (words.length == usedWord.size()) {
            answer[0] = 0;
            answer[1] = 0;
        } else {
            answer[0] = (usedWord.size() % n) + 1;
            answer[1] = (usedWord.size() / n) + 1;
        }
        System.out.println("usedWordSize : " + usedWord.size());
        System.out.println(answer[0] + ", " + answer[1]);
    }
}
