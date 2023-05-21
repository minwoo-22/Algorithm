package programmers.level01;

import java.util.*;

public class Race {
    public static void main(String[] args) {
        String[] players = {"a","b","c","d","e"};
        String[] callings = {"c","b","b"};
        List<String> list = new ArrayList<>();
        Map<String, Integer> indexMap = new HashMap<>();


        for (int i = 0; i < players.length; i++) {
            indexMap.put(players[i], i);
            list.add(players[i]);
        }

        for (int i = 0; i < callings.length; i++) {
            int index = indexMap.get(callings[i]);
            String prePlayer = list.get(index-1);
            list.remove(index);
            list.add(index-1, callings[i]);
            indexMap.put(callings[i], indexMap.get(callings[i])-1);
            indexMap.put(prePlayer, indexMap.get(prePlayer)+1);
        }
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
