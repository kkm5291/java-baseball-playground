package baseball.view;

import java.util.List;
import java.util.Scanner;

public class Input {

    private final Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in);
    }

    public String userInput() {
        System.out.print("숫자를 입력해 주세요 : ");
        return sc.nextLine();
    }

    public String reGameInput() {
        return sc.nextLine();
    }
}
