package programmers.level01;

import java.util.Stack;

public class MakingHambuger {
    public static void main(String[] args) {
        int[] ingredient = {2,1,1,2,3,1,2,3,1};
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < ingredient.length; i++) {
            stack.push(ingredient[i]);

            if (stack.size() >= 4) {
                int stackSize = stack.size();
                if (stack.get(stackSize-1) == 1 && stack.get(stackSize-2) == 3 &&
                    stack.get(stackSize-3) == 2 && stack.get(stackSize-4) == 1) {
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
