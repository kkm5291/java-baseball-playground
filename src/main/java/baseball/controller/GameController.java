package baseball.controller;

import baseball.model.Computer;
import baseball.model.Referee;
import baseball.model.User;
import baseball.util.InputValidate;
import baseball.view.Input;
import baseball.view.Result;

// todo 새 게임 시작하면 컴퓨터 번호도 바뀌어야 함.
public class GameController {

    public static void start() {

        Input inputView = new Input();
        Result resultView = new Result();
        InputValidate inputValidate = new InputValidate();

        boolean continueFlag = true;

        while(continueFlag) {
            playSingleGame(inputView, inputValidate, resultView);
            continueFlag = inputView.reGameInput();
        }

    }

    private static void playSingleGame(Input inputView, InputValidate inputValidate, Result resultView) {
        Computer computer = Computer.create();
        User user = new User();
        Referee referee = new Referee();

        while(referee.getStrikeCount() < 3) {
            String userInputNumber = inputView.userInput();
            inputValidate.validateUserInput(userInputNumber);
            user.setUserNumbers(userInputNumber);

            referee.call(computer.getNumbers(), user.getNumbers());
            resultView.printCallCount(referee.getBallCount(), referee.getStrikeCount());
        }

        resultView.printEnd();
    }
}
