package programmers.level00;

import java.util.*;

public class LengthOfOverlapping {
    public static void main(String[] args) {
        int[][] lines = {{0, 5}, {3, 9}, {1, 10}};
        LinkedList<Integer> list = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        int answer = 0;

        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0]; j < lines[i][1]; j++) {
                if (list.contains(j)) {
                    set.add(j);
                    continue;
                }
                list.add(j);
            }
        }

        answer = set.size();
        System.out.println(answer);
    }
}
