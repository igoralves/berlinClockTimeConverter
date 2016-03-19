package com.ubs.opsit.interviews.time;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Igor Alves on 2016-03-19.
 */
public class TimeTest {

    @Test
    public void createMyLocalTimeWithSuccess() {

        // HH:mm:ss
        final Time time1 = new Time("01:02:03");

        assertEquals(1, time1.getHour());
        assertEquals(2, time1.getMinute());
        assertEquals(3, time1.getSecond());

        // HH:mm
        final Time time2 = new Time("04:05");

        assertEquals(4, time2.getHour());
        assertEquals(5, time2.getMinute());
        assertEquals(0, time2.getSecond());
    }

    @Test(expected = IllegalArgumentException.class)
    public void createMyLocalTimeWithInvalidHour240001() {
        new Time("24:00:01");
    }

    @Test(expected = IllegalArgumentException.class)
    public void createMyLocalTimeWithInvalidHour240100() {
        new Time("24:01:00");
    }

    @Test(expected = IllegalArgumentException.class)
    public void createMyLocalTimeWithInvalidHour250000() {
        new Time("25:00:00");
    }

    @Test(expected = IllegalArgumentException.class)
    public void createMyLocalTimeWithInvalidMinute() {
        new Time("00:60:00");
    }

    @Test(expected = IllegalArgumentException.class)
    public void createMyLocalTimeWithInvalidSecond() {
        new Time("00:00:60");
    }

    @Test(expected = IllegalArgumentException.class)
    public void createMyLocalTimeWithInvalidCharacters() {
        new Time("A:A:A");
    }

    @Test(expected = IllegalArgumentException.class)
    public void createMyLocalTimeWithInvalidSyntax() {
        new Time("1");
    }
}