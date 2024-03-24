package TaskPacage.gui;

import java.util.Objects;
import java.util.Stack;

public class Task {

    public static int solutionEmbeddedStack(String[] list) throws Exception {
        JavaStackSimple<Integer> stack = new JavaStackSimple<>();
        return workWithStack(stack, list);
    }

    public static int solutionCustomStack(String[] list) throws Exception {
        CustomStack<Integer> stack = new CustomStack<>();
        return workWithStack(stack, list);
    }

    public static int workWithStack(SimpleStack<Integer> stack, String[] list) throws Exception {
        int a, b;
        int resultOpeartion;
        String operation;
        for (int i = 0; i < list.length; i++) {
            operation = list[i];

            switch (operation) {
                case "+":
                    a = stack.pop();
                    b = stack.pop();
                    resultOpeartion = a + b;
                    stack.push(resultOpeartion);
                    break;
                case "-":
                    a = stack.pop();
                    b = stack.pop();
                    resultOpeartion = b - a;
                    stack.push(resultOpeartion);
                    break;
                case "*":
                    a = stack.pop();
                    b = stack.pop();
                    resultOpeartion = a * b;
                    stack.push(resultOpeartion);
                    break;
                case "/":
                    a = stack.pop();
                    b = stack.pop();
                    resultOpeartion = b / a;
                    stack.push(resultOpeartion);
                    break;
                default:
                    stack.push(Integer.valueOf(list[i]));
            }
        }
        return stack.pop();
    }

}