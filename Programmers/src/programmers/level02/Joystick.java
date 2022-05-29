package programmers.level02;

// 이 문제의 핵심은 A를 만났을 때 순간순간 최단 거리를 선택해야 한다는 것이다.
public class Joystick {
    public static void main(String[] args) {
        String name = "JAN";
        int answer = solution(name);
        System.out.println(answer);
    }
    
    private static int solution(String name) {
        int answer = 0;
        int length = name.length();             //글자 길이
        int moveCnt = name.length() - 1;        //기본 이동 수
        
        for (int i = 0; i < length; i++) {
            int index = 0;
            
            if (name.charAt(i) > 'N') {
                answer += 'Z'-name.charAt(i)+1;
            } else {
                answer += name.charAt(i)-'A';
            }
            
            index = i + 1;
            while (index < length && name.charAt(index) == 'A') {
                index++;
            }
            
            //A를 만났을 때 그냥 그대로 가는 게 빠른가 뒤로 다시 돌아가는 게 빠른가?
            moveCnt = Math.min(moveCnt, i * 2 + length - index);
            //처음부터 뒤에서 시작하는 게 빠른가? ex) BBBBBAAAB 
            moveCnt = Math.min(moveCnt, (length - index) * 2 + i);
        }
        
        return answer + moveCnt;
    }
}
