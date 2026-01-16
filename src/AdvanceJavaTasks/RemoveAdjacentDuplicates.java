package AdvanceJavaTasks;

import java.util.*;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String s = "abbacd";
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch)
                stack.pop();
            else
                stack.push(ch);
        }

        StringBuilder result = new StringBuilder();
        for (char ch : stack)
            result.append(ch);

        System.out.println(result.toString());
    }
}

