package baekjoon.recursion;

import java.io.*;

public class Star10 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        char[][] stars = new char[N][N];
        deleteStar(stars, N);
        printStar(stars);
    }
    
    private static void deleteStar(char[][] stars, int N) {
        N /= 3;
        if (N == 0) {
            return;
        } else {
            for (int i = 0; i < stars.length; i++) {
                // i의 나머지
                int iRem = i % (3*N);
                for (int j = 0; j < stars[0].length; j++) {
                    // j의 나머지
                    int jRem = j % (3*N);
                    if (iRem >= (1*N) && iRem < (2*N) && jRem >= (1*N) && jRem < (2*N)) {
                        stars[i][j] = ' ';
                    } else if (stars[i][j] != ' '){
                        stars[i][j] = '*';
                    }
                }
            }
        }
        deleteStar(stars, N);
    }
    
    private static void printStar(char[][] stars) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars.length; j++) {
                sb.append(stars[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb.toString());
    }

}
