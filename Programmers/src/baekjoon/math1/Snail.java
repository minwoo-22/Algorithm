package baekjoon.math1;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("아침에 올라갈 높이> ");
        int a = scan.nextInt();
        System.out.print("저녁에 내려올 높이> ");
        int b = scan.nextInt();
        System.out.print("나무의 높이> ");
        int v = scan.nextInt();
        
        int tot = 0;
        int i = 1;
        
        while(true) {
            tot += a;
            if(tot >= v) {
                break;
            }
            tot -= b;
            i++;
        }
        
        System.out.println(i);
        scan.close();
    }
}
