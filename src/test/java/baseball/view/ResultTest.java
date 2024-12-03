package baseball.view;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    private static List<Arguments> provideBallCountForResult() {
        return List.of(
                Arguments.of(1,2,"1볼 2스트라이크"),
                Arguments.of(0,2,"2스트라이크"),
                Arguments.of(2,0,"2볼 ")
        );
    }

    @ParameterizedTest
    @MethodSource("provideBallCountForResult")
    @DisplayName("출력문 검증")
    public void printCheck(int ballCount, int strikeCount, String expectedResult) throws Exception {
        // given parameterized
        // when
        Result result = new Result();

        // then

        result.printCallCount(ballCount, strikeCount);
    }
}