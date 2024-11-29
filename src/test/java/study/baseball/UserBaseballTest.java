package study.baseball;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import study.baseball.code.Validation;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.fail;

public class UserBaseballTest {

    static Stream<Arguments> inputProvider() {
        return Stream.of(
                Arguments.of("123"),
                Arguments.of("12"),
                Arguments.of("1234")
        );
    }

    @ParameterizedTest
    @MethodSource("inputProvider")
    @DisplayName("숫자가 3이 아니면 예외 발생")
    void input_length_test(String input) {
        // given
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        Validation validation = new Validation();
        // when

        if (value.length() != 3) {
            Assertions.assertThrows(IllegalArgumentException.class, () -> validation.validate(value));
        } else {
            Assertions.assertEquals(3, value.length());
        }
    }
}
