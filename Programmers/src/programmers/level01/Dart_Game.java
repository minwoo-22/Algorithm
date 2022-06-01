package programmers.level01;

public class Dart_Game {
    public static void main(String[] args) {
        String dartResult = "1D2S#10S";
        System.out.println(solution(dartResult));
    }
    
    private static int solution(String dartResult) {
        int answer = 0;
        
        int[] numbers = new int[3];
        int length = dartResult.length();
        
        int j = 0;
        for (int i = 0; i < length; i++) {
            char c = dartResult.charAt(i);
            
            if (c >= '1' && c <= '9') {
                if (dartResult.charAt(i+1) == '0') {
                    numbers[j] = 10;
                    i++;
                } else {
                    numbers[j] = c - '0';
                }
            } else if (c == 'D') {
                numbers[j] = (int) Math.pow(numbers[j], 2);
                j++;
            } else if (c == 'T') {
                numbers[j] = (int) Math.pow(numbers[j], 3);
                j++;
            } else if (c == 'S') {
                j++;
            } else if (c == '*') {
                if (j-1 >= 0) {
                    numbers[j-1] *= 2;
                }
                if (j-2 >= 0) {
                    numbers[j-2] *= 2;
                }
            } else if (c == '#') {
                numbers[j-1] *= -1;
            }
        }
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            answer += numbers[i];
        }
        
        return answer;
    }
}
