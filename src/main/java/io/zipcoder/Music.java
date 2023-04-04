package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        ArrayList<String> musicSel = new ArrayList<String>(Arrays.asList(this.playList));
        int forwardCount = musicSel.indexOf(selection) - startIndex;
        int backwardCount = musicSel.size() + startIndex - musicSel.lastIndexOf(selection);
        // use build in function that returns minimum of two numbers.
        return Math.min(forwardCount, backwardCount);
    }
}
