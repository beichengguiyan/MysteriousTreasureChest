package com.game;


import com.sun.xml.internal.ws.util.StringUtils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

/**
 * @author HUAWEI
 */
public class Box {
    private int id;
    private String hashValue;
    private String previousHashValue;
    private int mysteriousNumber;
    public static final String CHECK = "00000";

    public Box(int id, String previousHashValue) {
        this.id = id;
        this.previousHashValue = previousHashValue;
    }


    public boolean tryOpen(int mysteriousNumber) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        setMysteriousNumber(mysteriousNumber);
        calculateHashValue();
        if (isOpen()) {
            return true;
        }
        return false;
    }

    public boolean isOpen() {
        if (CHECK.equals(hashValue.substring(0, 5))) {
            return true;
        }
        return false;
    }

    public void calculateHashValue() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String hashString = this.id + this.previousHashValue + this.mysteriousNumber;
        setHashValue(sha256(hashString));
    }

    public void setHashValue(String hashValue) {
        this.hashValue = hashValue;
    }

    public String getHashValue() {
        return hashValue;
    }

    public void setMysteriousNumber(int mysteriousNumber) {
        this.mysteriousNumber = mysteriousNumber;
    }

    public static String sha256(String s) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] encrypted = messageDigest.digest(s.getBytes("UTF-8"));
        for (byte b : encrypted) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
