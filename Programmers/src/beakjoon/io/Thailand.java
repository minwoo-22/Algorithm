package beakjoon.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thailand {

    public static void main(String[] args) throws NumberFormatException, IOException {
        // 543
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        
        System.out.println(A - 543);
    }

}
