package model;

import java.util.ArrayList;
import java.util.List;

public class Strike {
    private List<Integer> strikeIndexList = new ArrayList<>();
    private int strikeCount;

    public Strike(List<Integer> strikeIndexList, int strikeCount) {
        this.strikeIndexList = strikeIndexList;
        this.strikeCount = strikeCount;
    }
}
