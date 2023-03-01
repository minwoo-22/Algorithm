package programmers.level00;

public class ThrowTheBall {
    public static void main(String[] args) {
        int answer = 0;
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int k = 5;

        answer = numbers[((k-1) * 2) % numbers.length];

        System.out.println(answer);
    }
}
