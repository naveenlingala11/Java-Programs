package JavaBasic.CollectionsAndGenerics;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("stack "+stack);
        System.out.println("popped "+stack.pop());
        System.out.println("updated stack "+stack);
    }
}
