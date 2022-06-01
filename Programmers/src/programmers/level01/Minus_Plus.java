package programmers.level01;

public class Minus_Plus {
    public static void main(String[] args) {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        System.out.println(Solution(absolutes, signs));
    }
    private static int Solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer += (-1)*absolutes[i];
            }
        }
        
        return answer;
    }
}
