package programmers.level01;

import java.util.Arrays;

public class Wallpapers {
    public static void main(String[] args) {
        int[] answer = new int[4];
        String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        int lux = -1;
        int luy = 100;
        int rdx = 0;
        int rdy = 0;

        for (int i = 0; i < wallpaper.length; i++) {
            String paperLine = wallpaper[i];
            // lux 설정
            if (paperLine.contains("#") && lux == -1) {
                lux = i;
            }
            // luy 설정
            int luy_index = paperLine.indexOf("#");
            if (luy_index < luy && luy_index != -1) {
                luy = luy_index;
            }
            // rdx 설정
            if (paperLine.contains("#")) {
                rdx = i;
            }
            // rdy 설정
            int rdy_index = paperLine.lastIndexOf("#");
            if (rdy < rdy_index) {
                rdy = rdy_index;
            }
        }
        answer[0] = lux;
        answer[1] = luy;
        answer[2] = rdx + 1;
        answer[3] = rdy + 1;
        System.out.println(Arrays.toString(answer));
    }
}
