package baekjoon.oneDarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Remainder {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];
        int[] remainders = new int[42];
        int cnt = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            remainders[numbers[i] % 42]++;
        }
        
        for (int remainder : remainders) {
            if (remainder != 0) {
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }

}
