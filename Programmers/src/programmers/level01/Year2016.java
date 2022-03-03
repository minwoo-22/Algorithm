package level01;

public class year2016 {

    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        String result = solution(a, b);
        System.out.println(result);
    }
    
    private static String solution(int a, int b) {
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
        int totalDate = 0;
        for (int i = 0; i < a-1; i++) {
            totalDate += days[i];
        }
        totalDate += (b-1);
        int result = totalDate % 7;
        
        
        return day[(5+result)%7];
    }
    
    

}
