package baseball.domain;

import baseball.model.Referee;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class RefereeTest {


    private static List<Arguments> provideNumbersForComparison() {
        return List.of(
                Arguments.of(List.of(1,5,9), List.of(1,2,3), 1, 0),
                Arguments.of(List.of(1,2,3), List.of(1,2,3), 3, 0),
                Arguments.of(List.of(1,2,3), List.of(4,5,6), 0, 0),
                Arguments.of(List.of(1,2,3), List.of(2,3,1), 0, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForComparison")
    @DisplayName("볼_스트라이크_카운트")
    public void count(List<Integer> computer, List<Integer> user, int expectedStrikeCount, int expectedBallCount) throws Exception {
        // given parameterized

        // when
        Referee referee = new Referee();
        referee.call(computer, user);

        // then
        Assertions.assertThat(referee.getBallCount()).isEqualTo(expectedBallCount);
        Assertions.assertThat(referee.getStrikeCount()).isEqualTo(expectedStrikeCount);

    }
}
