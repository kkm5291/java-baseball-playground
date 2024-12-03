package baseball.view;

public class Result {

    public void printCallCount(int ballCount, int strikeCount) {
        StringBuilder result = new StringBuilder();

        if (ballCount > 0) {
            result.append(ballCount).append("볼 ");
        }

        if (strikeCount > 0) {
            result.append(strikeCount).append("스트라이크");
        }

        System.out.println(result);
    }

    public void printEnd() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
