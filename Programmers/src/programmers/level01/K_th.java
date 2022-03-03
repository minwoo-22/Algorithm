package level01;

import java.util.Arrays;

public class K_th {

    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}, {2,3,2}};
        int[] answer = solution(array, commands);
        System.out.println(Arrays.toString(answer));
    }
    
    private static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) { 
            int[] arrays = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(arrays);
            int number = arrays[commands[i][2]-1];
            answer[i] = number;
        }
        
        return answer;
    }
}
