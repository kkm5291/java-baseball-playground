package model;

import java.util.Random;

public class Computer {

    private String computerNumber;

    public Computer() {
        generateComputerNumber();
    }

    private void generateComputerNumber() {
        Random rand = new Random();
        this.computerNumber = String.valueOf(rand.nextInt(1000));
    }

    public String getNumber() {
        return this.computerNumber;
    }
}
