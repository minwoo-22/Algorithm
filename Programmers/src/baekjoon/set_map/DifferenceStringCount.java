package baekjoon.set_map;

import java.io.*;
import java.util.*;

public class DifferenceStringCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        // 서로 다른 문자열을 담을 set
        Set<String> diffString = new HashSet<>();
        int strLength = str.length();

        for (int j = 1; j < strLength+1; j++) {
            for (int k = 0; k < strLength; k++) {
                if (k + j > strLength) {
                    diffString.add(str.substring(k));
                    break;
                } else {
                    diffString.add(str.substring(k, k+j));
                }
            }
        }

        System.out.println(diffString.size());
    }
}