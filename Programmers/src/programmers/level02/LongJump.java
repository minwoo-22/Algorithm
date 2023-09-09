package programmers.level02;

public class LongJump {

    public static void main(String[] args) {
        long answer = 0;
        int n = 5;
        long[] arr = new long[n + 2];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;
        }
        answer = arr[n];
        System.out.println(answer);
    }
}
