package study.stringcalc;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import static org.assertj.core.api.Assertions.*;

import java.util.Scanner;
import java.util.Stack;

public class StringCalcTest {

    static String input = "";
    static String[] inputs = {};

    @BeforeAll
    static void setUp() {
        input = "2 + 3 * 4 / 2";
        inputs = input.split(" ");
    }

    @Test
    @DisplayName("문자열 입력")
    public void inputString() throws Exception {
        // given

        // 사용자 입력 Mock 설정
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // when
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        // then

        assertThat(value).isEqualTo(input);
    }

    @Test
    @DisplayName("문자열 Array 반환 후 빈칸 제거")
    public void trimArray() throws Exception {
        // given

        String[] trimArray = input.split(" ");

        // then
        assertThat(trimArray.length).isEqualTo(input.replaceAll(" ", "").length());

    }

    @Test
    @DisplayName("숫자, 연산자 판별")
    public void classification() throws Exception {
        // given

        Stack<Integer> numStack = new Stack<>();
        Stack<String> operationStack = new Stack<>();

        // when
        for(String target : inputs) {
            try {
                numStack.push(Integer.parseInt(target));
            } catch (NumberFormatException e) {
                operationStack.push(target);
            }
        }

        assertThat(numStack).containsExactly(2,3,4,2);
        assertThat(operationStack).containsExactly("+", "*", "/");

    }

    /**
     * 순서에 상관 없이 앞에먼저 계산되어야 함.
     * @throws Exception
     */
    @Test
    @DisplayName("계산")
    public void calc() throws Exception {
        // given
        Stack<Integer> numStack = new Stack<>();
        Stack<String> operationStack = new Stack<>();

        // when
        for (int i = inputs.length - 1; i >= 0; i--) {
            String target = inputs[i];
            try {
                numStack.push(Integer.parseInt(target));
            } catch (NumberFormatException e) {
                operationStack.push(target);
            }
        }

        // then
        while(!operationStack.isEmpty()) {
            int calcNum = calcOperation(numStack.pop(), numStack.pop(), operationStack.pop());
            numStack.push(calcNum);
        }


        assertThat(numStack.pop()).isEqualTo(10);
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
