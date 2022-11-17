package baekjoon.recursion;

import java.io.*;

public class Genius {
    public static int recursion(String s, int l, int r, int index, int[] cnt){
        cnt[index]++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1, index, cnt);
    }
    public static int isPalindrome(String s, int index, int[] cnt){
        return recursion(s, 0, s.length()-1, index, cnt);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] result = new int[N];
        int[] count = new int[N];

        for (int i = 0; i < N; i++) {
            result[i] = isPalindrome(br.readLine(), i, count);
            sb.append(result[i]).append(" ").append(count[i]).append("\n");
        }
        System.out.println(sb.toString());
    }
}