package programmers.level01;

public class SmallString {
    public static void main(String[] args) {
        String t = "10203";
        String p = "15";
        int answer = 0;

        for (int i = 0; i <= t.length()-p.length(); i++) {
            long tVal = Long.parseLong(t.substring(i, i+p.length()));
            long pVal = Long.parseLong(p);
            if (tVal <= pVal) answer++;
        }

        System.out.println(answer);
    }
}
