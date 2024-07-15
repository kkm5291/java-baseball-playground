package controller;

import model.User;
import view.InputView;

public class GameController {

    public static void start() {

        User user = new User();

        System.out.print("숫자를 입력해 주세요 : ");
        String userNumber = InputView.UserInput();

        user.setNumber(userNumber);


    }
}
