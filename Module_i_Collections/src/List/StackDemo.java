package List;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Initial Stack : " + stack);

        // Peek top element
        System.out.println("Top Element : " + stack.peek());

        // Search element
        System.out.println("Position of 30 : " + stack.search(30));

        // Traverse stack
        System.out.println("\nTraversing Stack:");
        for (Integer num : stack) {
            System.out.println(num);
        }

        // Pop elements
        System.out.println("\nPopped Element : " + stack.pop());
        System.out.println("Popped Element : " + stack.pop());

        System.out.println("\nStack After Pop : " + stack);

        // Peek again
        System.out.println("Current Top : " + stack.peek());

        // Empty check
        System.out.println("Is Stack Empty? " + stack.empty());

        // Clear stack completely
        while (!stack.empty()) {
            System.out.println("Removing : " + stack.pop());
        }

        System.out.println("\nStack After Clearing : " + stack);

        // Exception Handling
        try {
            stack.pop();
        } catch (Exception e) {
            System.out.println("Exception : Stack is Empty!");
        }
    }
}