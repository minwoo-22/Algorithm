package baekjoon.numberTheory;

import java.io.*;
import java.util.StringTokenizer;

public class MultiplesAndDivisors {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        int number1 = 0;
        int number2 = 0;

        while (true) {
            st = new StringTokenizer(br.readLine());
            number1 = Integer.parseInt(st.nextToken());
            number2 = Integer.parseInt(st.nextToken());

            if (number1 == 0 && number2 == 0) {
                break;
            }

            if (number1 < number2) {
                if (number2 % number1 == 0) {
                    sb.append("factor").append("\n");
                } else {
                    sb.append("neither").append("\n");
                }
            } else {
                if (number1 % number2 == 0) {
                    sb.append("multiple").append("\n");
                } else {
                    sb.append("neither").append("\n");
                }
            }
        }

        System.out.println(sb.toString());
    }
}