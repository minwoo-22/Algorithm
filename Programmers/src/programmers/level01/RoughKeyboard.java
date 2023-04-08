package programmers.level01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RoughKeyboard {
    public static void main(String[] args) {
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD", "AABB"};
        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                int result = findMinRepeats(keymap, targets[i].charAt(j));
                if (result == Integer.MAX_VALUE) {
                    answer[i] = -1;
                    break;
                } else {
                    answer[i] += result;
                }
            }
        }

        System.out.println(Arrays.toString(answer));
    }

    private static int findMinRepeats(String[] keymap, char target) {
        int min = Integer.MAX_VALUE;
        for (String key : keymap) {
            int repeats = 0;
            // 알파벳을 가지고 있지 않으면 패스
            if (!key.contains(target+"")) continue;

            for (int i = 0; i < key.length(); i++) {
                if (key.charAt(i) == target) {
                    repeats = i+1;
                    break;
                }
            }
            min = Math.min(min, repeats);
        }
        return min;
    }
}
