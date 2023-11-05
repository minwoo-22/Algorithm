package programmers.level02;

import java.util.Arrays;

public class HIndex {

    public static void main(String[] args) {
        int[] citations = {4, 0, 6, 1, 5};
        System.out.println(solution(citations));
    }
    
    private static int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= citations.length - i) {
                answer = citations.length - i;
                break;
            }
        }
        
        return answer;
    }

}
