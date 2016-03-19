package com.ubs.opsit.interviews;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Igor Alves on 2016-03-19.
 */
public class MyLocalTimeTest {

    @Test
    public void createMyLocalTimeWithSuccess() {

        // HH:mm:ss
        final MyLocalTime myLocalTime1 = new MyLocalTime("01:02:03");

        assertEquals(1, myLocalTime1.getHour());
        assertEquals(2, myLocalTime1.getMinute());
        assertEquals(3, myLocalTime1.getSecond());

        // HH:mm
        final MyLocalTime myLocalTime2 = new MyLocalTime("04:05");

        assertEquals(4, myLocalTime2.getHour());
        assertEquals(5, myLocalTime2.getMinute());
        assertEquals(0, myLocalTime2.getSecond());
    }

    @Test(expected = IllegalArgumentException.class)
    public void createMyLocalTimeWithInvalidHour240001() {
        new MyLocalTime("24:00:01");
    }

    @Test(expected = IllegalArgumentException.class)
    public void createMyLocalTimeWithInvalidHour240100() {
        new MyLocalTime("24:01:00");
    }

    @Test(expected = IllegalArgumentException.class)
    public void createMyLocalTimeWithInvalidHour250000() {
        new MyLocalTime("25:00:00");
    }

    @Test(expected = IllegalArgumentException.class)
    public void createMyLocalTimeWithInvalidMinute() {
        new MyLocalTime("00:60:00");
    }

    @Test(expected = IllegalArgumentException.class)
    public void createMyLocalTimeWithInvalidSecond() {
        new MyLocalTime("00:00:60");
    }

    @Test(expected = IllegalArgumentException.class)
    public void createMyLocalTimeWithInvalidCharacters() {
        new MyLocalTime("A:A:A");
    }

    @Test(expected = IllegalArgumentException.class)
    public void createMyLocalTimeWithInvalidSyntax() {
        new MyLocalTime("1");
    }
}