package com.game;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoxTest {
    @Test
    public void should_return_10_when() {
        //given
        Box box = new Box(0, 0);
        int number = 222;
        //when
       boolean actual =  box.isOpen(number);
    }

}