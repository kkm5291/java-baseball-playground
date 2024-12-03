package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class UserBaseballTest {

    @Test
    @DisplayName("String to Integer List")
    public void parseStringNums() throws Exception {
        // given

        String nums = "123";

        // when
        List<Integer> collect = nums.chars()
                .map(Character::getNumericValue)
                .boxed()
                .collect(Collectors.toList());

        // then
        Assertions.assertThat(collect).containsExactly(1, 2, 3);
    }
}
