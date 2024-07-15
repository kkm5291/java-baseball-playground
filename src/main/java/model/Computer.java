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

    public String getComputerNumber() {
        return this.computerNumber;
    }

    public void checkUserNumber(String userNumber) {
        int ballCount = 0;
        int strikeCount = 0;

        char[] computerNumberArray = getComputerNumber().toCharArray();
        char[] userNumberArray = userNumber.toCharArray();

        for (int i = 0; i < computerNumberArray.length; i++) {}
    }

    private int checkBallCount(char[] computerNumberArray, char[] userNumberArray) {

    }
}
