package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("split 테스트 1")
    public void split() throws Exception {
        //given
        String testcase = "1,2";

        //when
        String[] split = testcase.split(",");

        //then
        assertThat(split).contains("1", "2");
    }

    @Test
    @DisplayName("split 테스트 2")
    public void split2() throws Exception {
        //given
        String testcase = "1";
        //when
        String[] split = testcase.split(",");
        //then
        assertThat(split).containsExactly("1");
    }

    @Test
    @DisplayName("substring 테스트")
    public void substring() throws Exception {
        //given
        String testcase = "(1,2)";
        //when
        String substring = testcase.substring(1, testcase.length()-1);
        //then
        assertThat(substring).isEqualTo("1,2");
    }
}
