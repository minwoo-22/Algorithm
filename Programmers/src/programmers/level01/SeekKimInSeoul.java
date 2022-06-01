package programmers.level01;

public class SeekKimInSeoul {

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        String answer = solution(seoul);
        System.out.println(answer);
    }
    
    private static String solution(String[] seoul) {
        String answer = "";
        int index = 0;
        
        for (int i = 0; i < seoul.length; i++) {
            if ("Kim".equals(seoul[i])) {
                index = i;
            }
        }
        
        answer = "김서방은 "+index+"에 있다";
        
        return answer;
    }

}
