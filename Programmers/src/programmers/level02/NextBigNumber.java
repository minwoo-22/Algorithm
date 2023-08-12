package programmers.level02;

public class NextBigNumber {
    public static void main(String[] args) {
        int n = 15;
        int answer = 0;
        String binaryNum = Integer.toBinaryString(n);
        int count = oneCount(binaryNum);

        while (true) {
            n += 1;
            String tempBinaryNum = Integer.toBinaryString(n);
            if (count == oneCount(tempBinaryNum)) break;
        }

        System.out.println(n);
    }

    private static int oneCount(String binary) {
        int result = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') result++;
        }
        return result;
    }
}
