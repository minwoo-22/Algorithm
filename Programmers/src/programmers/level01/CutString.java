package programmers.level01;

public class CutString {
    public static void main(String[] args) {
        String s = "aaabbaccccabba";
        int answer = 0;

        char c = 0;
        int sameCount = 0;
        int diffCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c == 0)  {
                c = s.charAt(i);
                answer++;
            }

            if (c == s.charAt(i)) {
                sameCount++;
            } else {
                diffCount++;
            }

            if (sameCount == diffCount) {
                sameCount = 0;
                diffCount = 0;
                c = 0;
            }
        }

        System.out.println(answer);
    }
}
