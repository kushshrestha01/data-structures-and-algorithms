package multibracketvalidation;

import java.util.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input) {

        if(input.isEmpty()){
            throw new IllegalArgumentException();
        }

        if(!input.contains("{") || !input.contains("}") || !input.contains("(") || !input.contains(")") || !input.contains("[") || !input.contains("]")){
            return false;
        }

        Stack<Character> stack = new Stack();

        for (int i = 0; i < input.length(); i++)
        {
            char current = input.charAt(i);
            if (current == '{' || current == '(' || current == '[') {
                stack.push(current);
            }
            if (current == '}' || current == ')' || current == ']') {
                if(stack.empty()){
                    return false;
                }
                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        if(stack.empty()){
            return true;
        } else {
            return false;
        }
    }
}
