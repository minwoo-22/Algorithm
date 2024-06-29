package programmers.level02;

import java.util.*;

public class DonutAndGraph {
    public static void main(String[] args) {
        int[][] edges1 = {{2, 3}, {4, 3}, {1, 1}, {2, 1}};
        int[][] edges2 = {{4, 11}, {1, 12}, {8, 3}, {12, 7}, {4, 2}, {7, 11}
                , {4, 8}, {9, 6}, {10, 11}, {6, 10}, {3, 5}, {11, 1}, {5, 3}, {11, 9}, {3, 8}};
        int[] result = solution(edges1);

        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[][] edges) {
        Map<Integer, int[]> nodeCnt = new HashMap<>();
        int[] answer = {0, 0, 0, 0};

        for (int[] edge : edges) {
            int out = edge[0];
            int in = edge[1];

            nodeCnt.computeIfAbsent(out, data -> new int[]{0, 0});
            nodeCnt.computeIfAbsent(in, data -> new int[]{0, 0});
            nodeCnt.get(out)[0] += 1;
            nodeCnt.get(in)[1] += 1;
        }


        int[] cnts;
        for (int key : nodeCnt.keySet()) {
            cnts = nodeCnt.get(key);
//            System.out.println("key=" + key + ", " + Arrays.toString(cnts));
            // 들어오는 간선이 없고 나가는 간선이 2개 이상일때 생성점
            if (cnts[0] >= 2 && cnts[1] == 0) {
                answer[0] = key;
            } else if (cnts[0] == 0 && cnts[1] > 0) {  // 나가는 간선이 없고 들어오는 간선이 있으면 막대형
                answer[2]++;
            } else if (cnts[0] >= 2 && cnts[1] >= 2) { // 나가는 간선이 2개이고 들어오는 간선이 2개 이상이면 8자형
                answer[3]++;
            }

        }

        // 점정 나가는 노드 수가 막대와 8자를 제외한것이 도넛 그래프의 개수
        answer[1] = nodeCnt.get(answer[0])[0] - answer[2] - answer[3];

        return answer;
    }

}
