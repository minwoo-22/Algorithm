package programmers.level02;

import java.util.*;
import java.util.stream.Collectors;

public class MaxMin {
    public static void main(String[] args) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String s = "-1 2 -3 -4";
        String[] numberStr = s.split(" ");

        List<Integer> list =
                Arrays.stream(numberStr).map(i -> Integer.parseInt(i)).collect(Collectors.toList());
        Optional<Integer> max = list.stream().max(Comparator.comparingInt(a -> a));
        Optional<Integer> min = list.stream().min(Comparator.comparingInt(a -> a));

        System.out.println(min.get() + " " + max.get());
    }
}
