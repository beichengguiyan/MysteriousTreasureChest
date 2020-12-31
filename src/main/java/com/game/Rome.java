package com.game;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * @author HUAWEI
 */
public class Rome {
    private Box[] boxs;
    private int[] mysteriousNumbers;
    public static final int MAX_SEARCH_NUMBER = 100000000;

    public Rome(Box[] boxs) {
        this.boxs = boxs;
        this.mysteriousNumbers = new int[boxs.length];
    }

    public void searchAllMysteriousNumbers() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        for (int i = 0; i < boxs.length; i++) {
            if (i == 0) {
                mysteriousNumbers[i] = searchMysteriousNumber(boxs[i]);
            } else {
                boxs[i].setPreviousHashValue(boxs[i - 1].getHashValue());
                mysteriousNumbers[i] = searchMysteriousNumber(boxs[i]);
            }

        }
    }

    public int searchMysteriousNumber(Box box) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        int mysteriousNumber = 0;
        for (int i = 0; i < MAX_SEARCH_NUMBER; i++) {
            if (box.tryOpen(i)) {
                mysteriousNumber = i;
                break;
            }
        }
        return mysteriousNumber;
    }

    public int[] getMysteriousNumbers() {
        return mysteriousNumbers;
    }
}
