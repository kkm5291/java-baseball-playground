package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("split 잘 되나?")
    public void request1() throws Exception {
        // given

        String actual = "1,2";
        assertThat(actual.split(",")).contains("1", "2");

    }

    @Test
    @DisplayName("charAt 특정위치 문자 가져오기")
    public void request2() throws Exception {
        // given

        String actual = "abc";

        // when

        char actualChar1 = actual.charAt(0);
        char actualChar2 = actual.charAt(1);
        char actualChar3 = actual.charAt(2);

        // then

        assertThat(actualChar1).isEqualTo('a');
        assertThat(actualChar2).isEqualTo('b');
        assertThat(actualChar3).isEqualTo('c');

        assertThatThrownBy(() -> actual.charAt(3))
                .isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 3");

        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(() -> actual.charAt(4));
    }
}
