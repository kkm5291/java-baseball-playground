package baseball.model;

import java.util.*;

public class Computer {

    private final List<Integer> computerNumbers;
    private static final Random rand = new Random();

    private Computer(Set<Integer> computerNumbers) {
        this.computerNumbers = new ArrayList<>(computerNumbers);
    }

    public static Computer create() {
        return new Computer(generateComputerNumber());
    }

    private static Set<Integer> generateComputerNumber() {
        Set<Integer> numbers = new HashSet<>();

        while (numbers.size() < 3) {
            numbers.add(rand.nextInt(9) + 1);
        }
        return numbers;
    }

    public List<Integer> getNumbers() {
        return this.computerNumbers;
    }
}
