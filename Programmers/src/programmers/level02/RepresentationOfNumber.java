package programmers.level02;

public class RepresentationOfNumber {
    public static void main(String[] args) {
        int answer = 0;

        int n = 15;

        int flagNum = 1;
        while (flagNum <= n) {
            int sum = 0;

            for (int i = flagNum; i <= n; i++) {
                sum += i;
                if (sum == n) {
                    answer++;
                    break;
                }
                if (sum > n) break;
            }
            flagNum++;
        }

        System.out.println(answer);
    }
}
