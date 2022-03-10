package baekjoon.math1;

import java.util.Scanner;

public class Will_Be {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int T = scan.nextInt();
        
        for(int i = 0; i < T; i++) {
            int k = scan.nextInt();
            int n = scan.nextInt();
            
            int[] arr = new int[n];
                
            for(int j = 0; j < arr.length; j++) {
                arr[j] = j+1;
            }
                
            for(int l = 0; l < k; l++) {
                for(int a = 0; a < n-1; a++) {
                    int temp = arr[a]+arr[a+1];
                    arr[a+1] = temp;
                        
                }
                    
            }
            
            System.out.println(arr[n-1]);
                    
        }
        scan.close();
    }
}
