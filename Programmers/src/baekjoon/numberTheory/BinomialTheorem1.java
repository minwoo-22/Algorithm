package baekjoon.numberTheory;

import java.io.*;
import java.util.StringTokenizer;

public class BinomialTheorem1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int nFactorial = factorial(n);
        int rFactorial = factorial(r);
        int nrFactorial = factorial(n - r);

        System.out.println(nFactorial/(rFactorial*nrFactorial));
    }

    private static int factorial(int number) {
        if (number == 1 || number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}