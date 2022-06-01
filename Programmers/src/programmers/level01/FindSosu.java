package programmers.level01;

public class FindSosu {

    public static void main(String[] args) {
        int n = 10;
        int result = solution(n);
        System.out.println(result);
    }
    
//    private static int solution(int n) {
//        int answer = 0;
//        int check = 0;
//        
//        for (int i = 3; i <= n; i += 2) {
//            check = 0;
//            for (int j = 3; j <= i; j += 2) {
//                if (i % j == 0) {
//                    check++;
//                    continue;
//                }
//                
//                if (check > 1) break;
//            }
//            
//            if (check == 1) {
//                System.out.println(i);
//                answer++;
//            }
//        }
//        answer++;
//        
//        
//        return answer;
//    }
    
    // 이 문제는 에라토스테네스의 체를 사용하여 해결해야 한다.
    private static int solution(int n) {
        int answer = 0;
        // 인덱스 값을 숫자의 크기와 맞추기 위해 n+1개 만큼 생성했다.
        boolean[] check = new boolean[n+1];
        
        // boolean형의 기본값은 false 0 과 1은 소수가 아니기 때문에 제외했다
        for (int i = 2; i < check.length; i++) {
            check[i] = true;
        }
        
        for (int i = 2; i < n; i++) {
            if (check[i] == false) continue;  // 소수가 아니면
            
            // 자기 자신의 배수는 모두 소수가 아니다.
            for (int j = i*2; j <= n; j += i) {
                check[j] = false;
            }
        }
        
        // true의 개수를 찾으면 그것이 곧 소수의 개수이다.
        for (int i = 0; i < check.length; i++) {
            if (check[i] == true) answer++;
        }
        return answer;
    }

}
