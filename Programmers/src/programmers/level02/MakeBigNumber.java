package programmers.level02;

public class MakeBigNumber {

    public static void main(String[] args) {
        String number = "4177252841";
        int k = 3;
        String result = solution(number, k);
        System.out.println(result);
    }
    
    private static String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        char max;
        int index = 0;

        for(int i = 0; i < number.length() - k; i++) {
            max = '0';
            for(int j = index; j <= k + i; j++) {
                    if(max < number.charAt(j)) {
                        max = number.charAt(j); 
                        index = j + 1;
                    }
            }           
            sb.append(max);
        }
        
        return sb.toString();
    }
    
}
