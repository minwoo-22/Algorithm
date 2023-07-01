package programmers.level02;

public class Bracket {
    public static void main(String[] args) {
        boolean answer = true;
        String s = "(())()";
        int[] count = new int[2];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count[0]++;
            } else {
                count[1]++;
            }
            if (count[1] > count[0]) {
                answer = false;
                break;
            }
        }

        if (count[0] != count[1]) answer = false;

        System.out.println(answer);
    }
}
