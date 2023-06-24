package programmers.level02;

import java.util.Arrays;
import java.util.StringTokenizer;

public class JadenCase {
    public static void main(String[] args) {
        String s = " 3people   unFollowed me  ";
        String[] strings = s.split("");
        StringBuilder sb = new StringBuilder();

        // 공백 후 첫 번째 문자인지 확인하는 값
        boolean firstCheck = true;
        for (String str : strings) {
            String temp;
            if (" ".equals(str)) {
                firstCheck = true;
                sb.append(" ");
                continue;
            }

            if (firstCheck) {
                temp = str.toUpperCase();
                firstCheck = false;
            } else {
                temp = str.toLowerCase();
            }

            sb.append(temp);
        }

        System.out.println(sb.toString());
    }
}
