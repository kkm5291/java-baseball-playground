package baseball.model;

import java.util.List;
import java.util.Objects;

public class Referee {

    private int strikeCount;
    private int ballCount;

    public void call(List<Integer> computerNums, List<Integer> userNums) {
        strikeCount = 0;
        ballCount = 0;

        for(int i=0; i<computerNums.size(); i++) {
            count(computerNums, userNums, i);
        }
    }

    private void count(List<Integer> computerNums, List<Integer> userNums, int idx) {
        if (computerNums.contains(userNums.get(idx))) {
            ballCount++;
        }

        if (Objects.equals(computerNums.get(idx), userNums.get(idx))) {
            ballCount--;
            strikeCount++;
        }
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }
}
