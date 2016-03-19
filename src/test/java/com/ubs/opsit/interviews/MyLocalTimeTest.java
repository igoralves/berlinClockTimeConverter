package com.ubs.opsit.interviews;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Igor Alves on 2016-03-19.
 */
public class MyLocalTimeTest {

    @Test
    public void createMyLocalTime() {

        final MyLocalTime myLocalTime = new MyLocalTime("01:02:03");

        assertEquals(1, myLocalTime.getHour());
        assertEquals(2, myLocalTime.getMinute());
        assertEquals(3, myLocalTime.getSecond());
    }

    @Test(expected = Exception.class)
    public void createMyLocalTimeWithInvalidHour240001() {
        new MyLocalTime("24:00:01");
    }

    @Test(expected = Exception.class)
    public void createMyLocalTimeWithInvalidHour240100() {
        new MyLocalTime("24:01:00");
    }

    @Test(expected = Exception.class)
    public void createMyLocalTimeWithInvalidHour250000() {
        new MyLocalTime("25:00:00");
    }

    @Test(expected = Exception.class)
    public void createMyLocalTimeWithInvalidMinute() {
        new MyLocalTime("00:60:00");
    }

    @Test(expected = Exception.class)
    public void createMyLocalTimeWithInvalidSecond() {
        new MyLocalTime("00:00:60");
    }

    @Test(expected = Exception.class)
    public void createMyLocalTimeWithInvalidCharacters() {
        new MyLocalTime("A:A:A");
    }

    @Test(expected = Exception.class)
    public void createMyLocalTimeWithInvalidSyntax() {
        new MyLocalTime("1");
    }

}