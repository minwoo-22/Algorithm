package baekjoon.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Honeycomb {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()) - 1;
        int i = 1;
        
        while (N > 0) {
            N = N - (i * 6);
            i++;
        }
        
        System.out.println(i);
    }
}
