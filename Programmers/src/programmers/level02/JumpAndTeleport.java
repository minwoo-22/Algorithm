package programmers.level02;

public class JumpAndTeleport {
    public static void main(String[] args) {
        int N = 5000;
        int answer = 1;

        while (N != 2) {
            if (N % 2 == 0) {
                N /= 2;
            } else {
                N -= 1;
                answer++;
            }
        }

        System.out.println(answer);
    }
}
