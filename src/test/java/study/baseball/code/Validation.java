package study.baseball.code;

public class Validation {

    public boolean validate(String input) {
        if (input.length() < 3) {
            throw new IllegalArgumentException("3개 이하의 숫자는 입력할 수 없습니다.");
        } else if (input.length() > 3) {
            throw new IllegalArgumentException("3개 이하의 숫자는 입력할 수 없습니다.");
        }

        return true;
    }
}
