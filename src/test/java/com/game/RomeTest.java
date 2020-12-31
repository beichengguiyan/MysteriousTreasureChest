package com.game;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.*;

public class RomeTest {
    /**
     *
     */
    @Test
    public void should_return_3229170_when_given_box_one() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        //given
        Box box = new Box(1, "0");
        Box[] boxs = {box};
        Rome rome = new Rome(boxs);

        //when
        int actual = rome.searchMysteriousNumber(box);

        //then
        assertEquals(3229170, actual);
    }

}