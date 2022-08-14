package baekjoon.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplication {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int firstNum = Integer.parseInt(br.readLine());
        int secondNum = Integer.parseInt(br.readLine());
        
        // 두 번째 숫자의 백의 자리, 십의 자리, 일의 자리를 각각 구한다.
        // 일의 자리
        int A = secondNum % 10;
        // 십의 자리
        int B = secondNum % 100 / 10;
        // 백의 자리
        int C = secondNum % 1000 / 100;
        
        System.out.println(firstNum * A);
        System.out.println(firstNum * B);
        System.out.println(firstNum * C);
        System.out.println(firstNum * secondNum);
    }

}
