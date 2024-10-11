package topic_3_stack_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        topic_3_stack.Stack stack = new topic_3_stack.Stack(2);

        // Push values onto the stack
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter a number (0-9) to push:");
            int value = scanner.nextInt();
            stack.push(value);
        }

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        // Perform operations
        System.out.println("Addition:");
        performOperation(stack, "add");

        System.out.println("Subtraction:");
        performOperation(stack, "subtract");

        System.out.println("Multiplication:");
        performOperation(stack, "multiply");

        System.out.println("Division:");
        performOperation(stack, "divide");

        scanner.close();
    }

    private static void performOperation(topic_3_stack.Stack stack, String operation) {
        int a = stack.pop();
        int b = stack.pop();
        int result = 0;

        if (operation.equals("add")) {
            result = a + b;
        } else if (operation.equals("subtract")) {
            result = a - b;
        } else if (operation.equals("multiply")) {
            result = a * b;
        } else if (operation.equals("divide")) {
            result = (b != 0) ? a / b : 0; // Simple division check
        }

        stack.push(result);
        System.out.println("Result: " + result);
    }
}
