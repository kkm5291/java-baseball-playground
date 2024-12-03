package baseball.controller;

import baseball.model.Computer;
import baseball.model.Referee;
import baseball.model.User;
import baseball.util.InputValidate;
import baseball.view.Input;
import baseball.view.Result;

public class GameController {

    public static void start() {

        Input inputView = new Input();
        Result resultView = new Result();

        Computer computer = Computer.create();
        User user = new User();
        Referee referee = new Referee();

        InputValidate inputValidate = new InputValidate();

        boolean gameFlag = true;

        while(gameFlag) {
            String userInputNumber = inputView.userInput();
            inputValidate.validateUserInput(userInputNumber);
            user.setUserNumbers(userInputNumber);

            referee.call(computer.getNumbers(), user.getNumbers());
            resultView.printCallCount(referee.getBallCount(), referee.getStrikeCount());

            if (referee.getStrikeCount() == 3) {
                String reGameFlag = inputView.reGameInput();

                if (reGameFlag.equals("2")) {
                    gameFlag = false;
                }
            }
        }
    }
}
