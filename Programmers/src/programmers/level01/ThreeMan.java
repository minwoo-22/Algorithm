package programmers.level01;

public class ThreeMan {
    static int answer = 0;

    public static void main(String[] args) {
        int[] number = {-3, -2, -1, 0, 1, 2, 3};
        boolean[] check = new boolean[number.length];
        solution(number, check, 0, 0, 3);
        System.out.println(answer);
    }

    private static void solution(int[] number, boolean[] check, int startIndex, int total, int count) {
        if (count == 0) {
            if (total == 0) { answer += 1; };
            return;
        }

        for (int i = startIndex; i < number.length; i++) {
            if (check[i]) continue;
            total += number[i];
            check[i] = true;
            solution(number, check, i+1, total, count-1);
            total -= number[i];
            check[i] = false;
        }
    }
}
