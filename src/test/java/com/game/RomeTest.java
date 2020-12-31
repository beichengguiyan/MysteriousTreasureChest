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

    /**
     * 测试构建对象rome时，尝试寻找其中两个箱子的神秘数字
     * 如果: given 创建对象rome
     * 当:  when 调用创建对象的方法时
     * 则:  then 返回期望值
     */
    @Test
    public void should_return_3229170_and_1135497_when_given_two_box() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        //given
        Box box01 = new Box(1, "0");
        Box box02 = new Box(2);
        Box[] boxs = {box01, box02};
        Rome rome = new Rome(boxs);
        int[] expected = {3229170, 1135497};

        //when
        rome.searchAllMysteriousNumbers();
        int[] actual = rome.getMysteriousNumbers();

        //then
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

    /**
     * 测试构建对象rome时，尝试寻找其中十个箱子的神秘数字
     * 如果: given 创建对象rome
     * 当:  when 调用创建对象的方法时
     * 则:  then 返回期望值
     */
    @Test
    public void should_return_3229170_and_so_on_when_given_ten_box() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        //given
        Box box01 = new Box(1, "0");
        Box box02 = new Box(2);
        Box box03 = new Box(3);
        Box box04 = new Box(4);
        Box box05 = new Box(5);
        Box box06 = new Box(6);
        Box box07 = new Box(7);
        Box box08 = new Box(8);
        Box box09 = new Box(9);
        Box box10 = new Box(10);
        Box[] boxs = {box01, box02, box03, box04, box05, box06, box07, box08, box09, box10};
        Rome rome = new Rome(boxs);
        int[] expected = {3229170, 1135497, 2125891, 3041721, 179272, 1295904, 395138, 1871275, 99911, 1695112};

        //when
        rome.searchAllMysteriousNumbers();
        int[] actual = rome.getMysteriousNumbers();

        //then
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
        assertEquals(expected[2], actual[2]);
        assertEquals(expected[3], actual[3]);
        assertEquals(expected[4], actual[4]);
        assertEquals(expected[5], actual[5]);
        assertEquals(expected[6], actual[6]);
        assertEquals(expected[7], actual[7]);
        assertEquals(expected[8], actual[8]);
        assertEquals(expected[9], actual[9]);
    }

}