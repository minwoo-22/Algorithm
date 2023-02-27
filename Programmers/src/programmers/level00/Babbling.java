package programmers.level00;

public class Babbling {
    public static void main(String[] args) {
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};

        System.out.println(solution(babbling));
    }

    private static int solution(String[] babbling) {
        int answer = 0;

        String[] babblingArray = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i < babbling.length; i++) {
            String change = babbling[i];
            for (int j = 0; j < 4; j++) {
                change = change.replace(babblingArray[j], " ");
            }
            if (change.trim().equals("")) answer++;
        }

        return answer;
    }
}
