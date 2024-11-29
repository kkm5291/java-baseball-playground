package study.baseball;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ComBaseballTest {

    @Test
    @DisplayName("컴퓨터 랜덤숫자 반환 단, 숫자가 중복되면 안됨.")
    public void computer_random_num() throws Exception {
        // given

        Random rand = new Random();
        Set<Integer> set = new HashSet<>();

        // when
        while (set.size() != 3) {
            int i = rand.nextInt(10) + 1;
            set.add(i);
        }

        // then
        Assertions.assertEquals(3, set.size());

    }
}
