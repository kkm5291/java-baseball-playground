package StringCalc;

import StringCalc.utils.CalcUtils;

import java.util.Stack;

public class StringCalcMain {

    public static void main(String[] args) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> operationStack = new Stack<>();

        CalcUtils calcUtils = new CalcUtils(numStack, operationStack);

        String input = calcUtils.input();

        String[] calcArray = input.split(" ");

        for (int i = calcArray.length - 1; i >= 0; i--) {
            calcUtils.pushStack(calcArray[i]);
        }

        System.out.println(calcUtils.calc());
    }
}