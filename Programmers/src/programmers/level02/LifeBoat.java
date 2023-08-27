package programmers.level02;

import java.util.Arrays;

public class LifeBoat {
    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        int answer = 0;
        int index = 0;

        Arrays.sort(people);
        for (int i = people.length - 1; i >= index; i--) {
            if (people[i] + people[index] <= limit) {
                index++;
                answer++;
            } else {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
