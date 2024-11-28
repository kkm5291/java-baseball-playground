package StringCalc.utils;

import java.util.Scanner;
import java.util.Stack;

public class CalcUtils {

    private final Stack<Integer> numStack;
    private final Stack<String> operationStack;

    public CalcUtils(Stack<Integer> numStack, Stack<String> operationStack) {
        this.numStack = numStack;
        this.operationStack = operationStack;
    }

    public String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void pushStack(String target) {
        try {
            numStack.push(Integer.parseInt(target));
        } catch (NumberFormatException e) {
            operationStack.push(target);
        }
    }

    public int calc() {

        while(!operationStack.isEmpty()) {
            int calcNum = calcOperation(numStack.pop(), numStack.pop(), operationStack.pop());
            numStack.push(calcNum);
        }

        return numStack.pop();
    }

    private int calcOperation(int first, int second, String operation) {
        if (operation.equals("+")) {
            return first + second;
        } else if (operation.equals("*")) {
            return first * second;
        }
        return first / second;
    }
}
