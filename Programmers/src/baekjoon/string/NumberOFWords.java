package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOFWords {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
        String str = br.readLine();
        br.close();

        str = str.trim();
        String[] words = str.split(" ");
        
        if (str.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(words.length);
        }
    }

}
