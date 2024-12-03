package baseball.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class User {

    private List<Integer> userNumbers = new ArrayList<>();

    public List<Integer> getNumbers() {
        return userNumbers;
    }

    public void setUserNumbers(String userNumber) {
        this.userNumbers = parseInput(userNumber);
    }

    private List<Integer> parseInput(String input) {

        return input.chars()
                .map(Character::getNumericValue)
                .boxed()
                .collect(Collectors.toList());
    }
}
