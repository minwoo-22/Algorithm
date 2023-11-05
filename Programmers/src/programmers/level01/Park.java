package programmers.level01;

public class Park {
    public static void main(String[] args) {
        String[] park = {"OS","OOO","OXO","OOO"};
        String[] routes = {"E 2","S 3","W 1"};
        int[] answer = new int[2];
        // 공원의 세로 길을 String 배열로 변경
        String[] parkH = new String[park[0].length()];
        for (int i = 0; i < park[0].length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < park.length; j++) {
                char p = park[j].charAt(i);
                if (p == 'S') {
                    answer[0] = j;
                    answer[1] = i;
                }
                sb.append(p);
            }
            parkH[i] = sb.toString();
        }

        int parkWidth = park[0].length();
        int parkHeight = park.length;

        for (int i = 0; i < routes.length; i++) {
            String[] route = routes[i].split(" ");
            int moveCount = Integer.parseInt(route[1]);
            switch (route[0]) {
                case "E":
                    if (answer[1] + moveCount <= parkWidth - 1) {
                        // 이동할 길
                        String temp = park[answer[0]].substring(answer[1], answer[1] + moveCount);
                        if (!temp.contains("X")) {
                            answer[1] += moveCount;
                        }
                    }
                    break;
                case "W":
                    if (answer[1] - moveCount >= 0) {
                        String temp = park[answer[0]].substring(answer[1] - moveCount, answer[1]);
                        if (!temp.contains("X")) {
                            answer[1] -= moveCount;
                        }
                    }
                    break;
                case "S":
                    if (answer[0] + moveCount <= parkHeight - 1) {
                        String temp = parkH[answer[1]].substring(answer[0], answer[0] + moveCount);
                        if (!temp.contains("X")) {
                            answer[0] += moveCount;
                        }
                    }
                    break;
                case "N":
                    if (answer[0] - moveCount >= 0) {
                        String temp = park[answer[1]].substring(answer[0] - moveCount);
                        if (!temp.contains("X")) {
                            answer[0] -= moveCount;
                        }
                    }
                    break;
            }
        }

        System.out.println(answer[0] + " " + answer[1]);
    }
}
