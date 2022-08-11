package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNumber {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String number = br.readLine();
        
        int sum = 0;
        
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(number.charAt(i)+"");
        }
        
        System.out.println(sum);
    }

}
