package util;

import model.Computer;
import model.User;

import java.util.HashMap;
import java.util.Map;

public class NumberUtils {

    public int checkStrikeCount(Computer computer, User user) {
        int strikeCount = 0;

        char[] computerNumberArray = computer.getNumber().toCharArray();
        char[] userNumberArray = user.getNumber().toCharArray();

        for (int i = 0; i < computerNumberArray.length; i++) {
            if (computerNumberArray[i] == userNumberArray[i]) strikeCount++;
        }

        return strikeCount;
    }

    // todo
    //  어떻게 strike 카운터와 분리해서 ball count를 늘릴것인가.................................
    private int checkBallCount(Computer computer, User user) {
        Map<Integer, Integer> map = new HashMap<>();
    }
}
