package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Crane {
    public static void main(String[] args) {
        int[][] board = {
                {0,0,0,0,0},
                {0,0,1,0,3},
                {0,2,5,0,1},
                {4,2,4,4,2},
                {3,5,1,3,1}
        };
        int[] moves = {1,5,3,5,1,2,1,4};
        
        int answer = Solution(board, moves);
        System.out.println(answer);
    }
    
    private static int Solution(int[][] board, int[] moves) {
        List<Integer> box = new LinkedList<Integer>();
        
        int answer = 0;
        List<Stack> list = new ArrayList<>();
        
        for (int i = 0; i < board.length; i++) {
            Stack<Integer> stack = new Stack();
            for (int j = board[i].length-1; j >= 0; j--) {
                if (board[j][i] != 0) {
                    stack.push(board[j][i]);
                }
                
            }
            list.add(stack);
        }
        System.out.println(list.toString());
        
        int temp = -1;
        for (int i = 0; i < moves.length; i++) {
            if (list.get(moves[i]-1).size() != 0) {
                int number = (int) list.get(moves[i]-1).pop();
                System.out.println("number : " + number);
                if (number == temp && box.size() >= 1) {
                    box.remove(box.size()-1);
                    if (box.size() == 0) {
                        temp = -1;
                    } else {
                        temp = box.get(box.size()-1);
                    }
                    answer += 2;
                }else {
                    box.add(number);
                    temp = number;
                }
            }
            System.out.println(box.toString());
        }
        return answer;
    }

}
