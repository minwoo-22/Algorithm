package programmers.level00;

public class Parallel {
    public static void main(String[] args) {
        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        int answer = 0;

        // 첫 번째 경우의 수 (1, 2), (3, 4)
        int line1_x = dots[0][0] - dots[1][0];
        int line1_y = dots[0][1] - dots[1][1];
        int line2_x = dots[2][0] - dots[3][0];
        int line2_y = dots[2][1] - dots[3][1];

        // 기울기가 같나?
        if (line1_y * line2_x == line2_y * line1_x) {
            answer = 1;
        } else {
            // 두 번째 경우의 수 (2, 3), (1, 4)
            line1_x = dots[1][0] - dots[2][0];
            line1_y = dots[1][1] - dots[2][1];
            line2_x = dots[0][0] - dots[3][0];
            line2_y = dots[0][1] - dots[3][1];

            if (line1_y * line2_x == line2_y * line1_x) answer = 1;
        }

        System.out.println(answer);
    }
}
