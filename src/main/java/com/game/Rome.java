package com.game;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * @author HUAWEI
 */
public class Rome {
    private Box[] boxs;
    private int[] mysteriousNumbers;

    public Rome(Box[] boxs) {
        this.boxs = boxs;
    }

    public void searchAllMysteriousNumbers() {
        for (Box box : boxs
        ) {

        }
    }

    public int searchMysteriousNumber(Box box) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        int mysteriousNumber = 0;
        for (int i = 0; i < 10000000; i++) {
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
