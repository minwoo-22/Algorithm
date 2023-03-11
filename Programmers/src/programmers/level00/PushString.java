package programmers.level00;

public class PushString {
    public static void main(String[] args) {
        int answer = 0;

        // 나의 코드... start
        String A = "hello";
        String B = "lohel";
        int aSize = A.length();
        StringBuilder sb = new StringBuilder(A);

        for (int i = 0; i < aSize; i++) {
            if (sb.toString().equals(B)) break;
            sb = new StringBuilder();
            sb.append(A.charAt(aSize-1)).append(A).deleteCharAt(aSize);
            A = sb.toString();
            answer++;
        }
        if (answer == aSize) answer = -1;
        // 나의 코드... end

        // 센세 코드... start
        String tempB = B.repeat(3);
//        return tempB.indexOf(A);
        System.out.println(tempB.indexOf(A));
        // 센세 코드... end

        System.out.println(answer);
    }
}
