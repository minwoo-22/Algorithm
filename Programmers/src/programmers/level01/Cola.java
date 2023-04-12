package programmers.level01;

public class Cola {
    static int answer = 0;
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int n = 20;

        getCoke(a, b, n);
        System.out.println("answer : " + answer);
    }

    private static void getCoke(int a, int b, int n) {
        if (n / a < 1) return;

        int result = (n / a) * b;
        int remain = n % a;
        answer += result;
        getCoke(a, b, result + remain);
    }
}
