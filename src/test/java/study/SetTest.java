package study;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("set 사이즈 확인 테스트")
    public void request1() throws Exception {
        // given

        int size = numbers.size();

        // then
        assertThat(size).isEqualTo(3);

    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    @DisplayName("set 자료구조 내부 값 존재여부 확인")
    public void request2(int num) throws Exception {
        // given

        Assertions.assertTrue(numbers.contains(num));
    }

    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
    @DisplayName("1,2,3은 참 4,5 값은 false")
    public void request3(int input, String expected) throws Exception {
        // given

        assertThat(String.valueOf(numbers.contains(input))).isEqualTo(expected);
    }
}
