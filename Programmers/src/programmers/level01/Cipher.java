package programmers.level01;

import java.util.stream.Stream;

public class Cipher {
    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        StringBuilder sb = new StringBuilder();

        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            int count = 1;
            while (count <= index) {
                ++c;
                if (c > 'z') c -= 26;
                if (skip.contains(Character.toString(c))) {
                    continue;
                } else {
                    count++;
                }
            }
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
