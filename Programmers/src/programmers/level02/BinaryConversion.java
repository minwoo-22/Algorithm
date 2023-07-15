package programmers.level02;

public class BinaryConversion {
    public static void main(String[] args) {
        String s = "110010101001";

        int[] answer = new int[2];
        int delZeroCount = 0;
        int binaryChangeCount = 0;

        while (!s.equals("1")) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    delZeroCount++;
                }
            }
            s = s.replace("0", "");
            s = binaryChange(s.length());
            binaryChangeCount++;
        }

        answer[0] = binaryChangeCount;
        answer[1] = delZeroCount;
    }

    private static String binaryChange(int length) {
        StringBuilder sb = new StringBuilder();

        while (!(length == 1)) {
            int remain = length % 2;
            length /= 2;

            sb.insert(0, remain);
        }

        sb.insert(0, 1);
        return sb.toString();
    }
}
