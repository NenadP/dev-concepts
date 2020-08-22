package algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class isBalanced {

    public static void main(String[] args) {
        isBalanced("{([]+(ddd)ass)f}");
    }

    static void isBalanced(String str) {

        Stack<Character> stack = new Stack<>();

        Map<Character, Character> map = new HashMap<>();

        map.put(']', '[');
        map.put(')', '(');
        map.put('}', '{');

        for (Character c : str.toCharArray()) {

            if ("[({".indexOf(c) > -1) {
                stack.push(c);
            } else if ("])}".indexOf(c) > -1) {

                if (stack.empty()) {
                    System.out.println("Its not balanced 1");
                    return;
                }

                Character last = stack.peek();

                if (last.equals(map.get(c))) {
                    stack.pop();
                } else {
                    System.out.println("Its not balanced 2");
                    return;
                }
            }
        }

        if (!stack.empty()) {
            System.out.println("Its not balanced 3");
            return;
        }

        System.out.println("its balanced");
    }
}
