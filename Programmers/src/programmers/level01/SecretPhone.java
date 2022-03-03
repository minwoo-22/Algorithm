package level01;


public class SecretPhone {

    public static void main(String[] args) {
        String phone_number = "01033332222";
        String answer = solution(phone_number);
        System.out.println(answer);
    }
    
    private static String solution(String phone_number) {
        String answer = "";
        for (int i = 0; i < phone_number.length(); i++) {
            if (i < phone_number.length()-4) {
                answer += "*";
            } else {
                answer += phone_number.charAt(i)+"";
            }
        }
        
        return answer;
    }

}
