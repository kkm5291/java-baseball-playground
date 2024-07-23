package util;

import model.Computer;
import model.Strike;
import model.User;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class NumberUtils {

    public void checkScore(Computer computer, User user) {

        List<String> computerNumberList = new ArrayList<>(Arrays.asList(computer.getNumber().split("")));
        List<String> userNumberList = new ArrayList<>(Arrays.asList(user.getNumber().split("")));

        List<Integer> strikeIndex = new ArrayList<>();
        int strikeCount = 0;
        int ballCount = 0;

        for (int i = 0; i < computerNumberList.size(); i++) {
            if (computerNumberList.get(i).equals(userNumberList.get(i))) {
                strikeCount++;
                strikeIndex.add(i);
            }
        }

        for (int i = 0; i < userNumberList.size(); i++) {
            if (!strikeIndex.contains(i) && !computerNumberList.contains(userNumberList.get(i))) {
                ballCount++;
            }
        }
    }
}
