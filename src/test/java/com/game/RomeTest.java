package com.game;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.*;

/**
 * @author HUAWEI
 */
public class RomeTest {

    /**
     * 测试构建对象rome时，尝试寻找其中第一个箱子的神秘数字
     * 如果: given 创建对象rome
     * 当:  when 调用创建对象的方法时
     * 则:  then 返回期望值
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