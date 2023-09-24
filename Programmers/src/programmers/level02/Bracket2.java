package programmers.level02;

import java.util.Stack;

public class Bracket2 {
    public static void main(String[] args) {
        String s = "}]()[{";
        int answer = 0;

        Stack<Character> stack;
        for (int i = 0; i < s.length(); i++) {
            stack = new Stack<>();
            for (int j = i; j < s.length() + i; j++) {
                char c = s.charAt(j % s.length());

                if (stack.isEmpty()) {
                    stack.push(c);
                } else if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    stack.push(c);
                }

            }
            if (stack.isEmpty()) answer++;
        }
        System.out.println(answer);
    }
}