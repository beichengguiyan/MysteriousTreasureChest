package com.game;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.*;

public class BoxTest {

    /**
     * 测试构建box时，尝试开箱的操作
     * 如果: given 创建对象box和测试的神秘数字
     * 当:  when 调用创建对象的方法时
     * 则:  then 品质依然为50
     */
    @Test
    public void should_return_false_when_given_number_222() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        //given
        Box box = new Box(0, "0");
        int number = 222;

        //when
        boolean actual = box.tryOpen(number);

        //then
        assertFalse(actual);
    }

}