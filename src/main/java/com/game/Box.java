package com.game;


import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author HUAWEI
 */
public class Box {
    private int id;
    private String hashValue;
    private String previousHashValue;
    private int mysteriousNumber;
    public static final String CHECK = "00000";
    public static final int MAX_CHECK_NUMBER = 5;

    public Box(int id, String previousHashValue) {
        this.id = id;
        this.previousHashValue = previousHashValue;
    }

    public Box(int id) {
        this.id = id;
    }

    public boolean tryOpen(int mysteriousNumber) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        setMysteriousNumber(mysteriousNumber);
        calculateHashValue();
        return isOpen();
    }

    public boolean isOpen() {
        if (CHECK.equals(getHashValue().substring(0, MAX_CHECK_NUMBER))) {
            return true;
        }
        return false;
    }

    public void calculateHashValue() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String hashString = this.id + this.previousHashValue + this.mysteriousNumber;
        setHashValue(sha256(hashString));
    }

    public String getHashValue() {
        return hashValue;
    }

    public void setHashValue(String hashValue) {
        this.hashValue = hashValue;
    }

    public void setPreviousHashValue(String previousHashValue) {
        this.previousHashValue = previousHashValue;
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
