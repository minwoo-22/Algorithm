package baekjoon.math1;

import java.util.Scanner;


public class Sonik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // 상수 설정
        final int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int year = 0;
        
        if(b < c) {
            year = a/(c-b) + 1;
        }else {
            year = -1;
        }
        
        System.out.println(year);
        scan.close();
    }
}
