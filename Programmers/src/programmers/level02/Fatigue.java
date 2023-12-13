package programmers.level02;

public class Fatigue {
    private static int answer;
    private static boolean[] visit;
    public static void main(String[] args) {
        int k = 80;
        int count = 0;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        visit = new boolean[dungeons.length];

        dfs(count, k, dungeons);
        System.out.println(answer);
    }

    private static void dfs(int count, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (visit[i] || k < dungeons[i][0]) continue;
            visit[i] = true;
            dfs(count + 1, k - dungeons[i][1], dungeons);
            visit[i] = false;
        }
        answer = Math.max(answer, count);
    }
}
