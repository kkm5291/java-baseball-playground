package baseball.util;

public class InputValidate {

    private static final String WRONG_LENGTH = "3개의 숫자를 입력해 주세요";
    private static final String WRONG_NUMBER = "숫자만 입력해 주세요";

    public void validateUserInput(String userInput) {
        boolean isValid = userInput.chars().allMatch(Character::isDigit);
        if (userInput.length() != 3) {
            throw new IllegalArgumentException(WRONG_LENGTH);
        }

        if (!isValid) {
            throw new IllegalArgumentException(WRONG_NUMBER);
        }
    }
}
