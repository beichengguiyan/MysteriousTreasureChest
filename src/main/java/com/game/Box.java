package com.game;

import java.util.Date;

/**
 * @author HUAWEI
 */
public class Box {
    private int id;
    private Date date;
    private int hashValue;
    private int previousHashValue;
    private int mysteriousNumber;

    public Box(int id, Date date, int hashValue, int previousHashValue, int mysteriousNumber) {
        this.id = id;
        this.date = date;
        this.hashValue = hashValue;
        this.previousHashValue = previousHashValue;
        this.mysteriousNumber = mysteriousNumber;
    }

    public boolean isOpen() {
        return false;
    }

}
