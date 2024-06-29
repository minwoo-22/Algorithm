package programmers.level02;

import java.util.*;

public class DonutAndGraph2 {
    public static void main(String[] args) {
        int[][] edges1 = {{2, 3}, {4, 3}, {1, 1}, {2, 1}};
        int[][] edges2 = {{4, 11}, {1, 12}, {8, 3}, {12, 7}, {4, 2}, {7, 11}
                , {4, 8}, {9, 6}, {10, 11}, {6, 10}, {3, 5}, {11, 1}, {5, 3}, {11, 9}, {3, 8}};
        int[] result = solution(edges1);

        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[][] edges) {
        int[] answer = new int[4];
        int createrNode = 0;
        int donutGraph = 0;
        int barGraph = 0;
        int eightGraph = 0;

        // out->in, in->out
        Map<Integer, List<Integer>> outMap = new HashMap<>();
        Map<Integer, List<Integer>> inMap = new HashMap<>();

        for (int[] edge : edges) {
            outMap.computeIfAbsent(edge[0], data -> new ArrayList<>()).add(edge[1]);
            inMap.computeIfAbsent(edge[1], data -> new ArrayList<>()).add(edge[0]);
        }

        for (int key : outMap.keySet()) {
            // 나가는 점이 2개 이상이지만 돌아오는 간선이 없는 노드가 생성점이다.
            if (outMap.get(key).size() >= 2 && inMap.get(key) == null) {
                createrNode = key;
            }
            // 나가는 간선이 2이고 들어오는 간선이 2 이상이면 8자형
            else if (outMap.get(key).size() == 2) {
                if (inMap.get(key) != null && inMap.get(key).size() >= 2) {
                    eightGraph++;
                }
            }
        }

        // 들어오는 간선이 있고 나가는 간선이 없으면 막대형
        for (int key : inMap.keySet()) {
            if (inMap.get(key).size() > 0 && outMap.get(key) == null) {
                barGraph++;
            }
        }

        // 생성점에서 출발한 간선 수(총 그래프 수) - 8자형 - 막대형 = 도넛형
        donutGraph = outMap.get(createrNode).size() - eightGraph - barGraph;

        answer[0] = createrNode;
        answer[1] = donutGraph;
        answer[2] = barGraph;
        answer[3] = eightGraph;

        return answer;
    }

}
