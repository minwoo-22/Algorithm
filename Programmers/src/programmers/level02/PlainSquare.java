package programmers.level02;

public class PlainSquare {
    public static void main(String[] args) {
        int w = 12;
        int h = 8;
        long answer = solution(w, h);
        System.out.println(answer);
    }
    
    static long solution(int w, int h) {
        long answer = 0;
        long squares = (long)w * h;
        
        while (true) {
            if (h == w) {
                answer += w;
                break;
            } else {
                if (w > h) {
                    w -= h;
                    answer +=  h;
                } else if (w < h){
                    h -= w;
                    answer += w;
                }
            }
        }
        answer = squares - answer;
        return answer;
    }
}
