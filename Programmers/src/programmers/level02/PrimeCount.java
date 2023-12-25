package programmers.level02;

import java.util.Arrays;

public class PrimeCount {
    public static void main(String[] args) {
        int answer = solution(437674, 3);
        System.out.println(answer);
    }
    private static int solution(int n, int k) {
        String s = Long.toString(n, k);

        String[] primeArr = s.split("0+");

        int primeCount = 0;

        for (String p : primeArr) {
            if (isPrime(Long.parseLong(p))) primeCount++;
        }
        return primeCount;
    }

    public static boolean isPrime(long n) {
        if (n == 1) return false;
        if (n == 2) return true;

        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
