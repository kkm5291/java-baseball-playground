package baseball.model;

import java.util.*;

public class Computer {

    private final List<Integer> computerNumbers;

    private Computer(Set<Integer> computerNumbers) {
        this.computerNumbers = new ArrayList<>(computerNumbers);
    }

    public static Computer createComputer() {
        return new Computer(generateComputerNumber());
    }

    private static Set<Integer> generateComputerNumber() {
        Random rand = new Random();

        Set<Integer> numbers = new HashSet<>();

        while (numbers.size() < 3) {
            numbers.add(rand.nextInt(10) + 1);
        }
        return numbers;
    }

    public List<Integer> getNumber() {
        return this.computerNumbers;
    }
}
