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

    public Box(int id, int previousHashValue) {
        this.id = id;
        this.previousHashValue = previousHashValue;
    }


    public boolean isOpen(int number) {

        return false;
    }

    public void setDate(Date date) {
        this.date = new Date();
    }

    public void setMysteriousNumber(int mysteriousNumber) {
        this.mysteriousNumber = mysteriousNumber;
    }
}
