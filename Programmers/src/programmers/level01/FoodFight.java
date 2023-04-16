package programmers.level01;

public class FoodFight {
    public static void main(String[] args) {
        int[] food = {1, 3, 4, 6};
        StringBuilder sb = new StringBuilder();
        sb.append("0");
        for (int i = food.length-1; i > 0; i--) {
            // 음식의 수
            int number = food[i] / 2;
            String repeat = String.valueOf(i).repeat(number);
            sb.insert(0, repeat).append(repeat);
        }

        System.out.println(sb.toString());
    }
}
