package com.ubs.opsit.interviews;

/**
 * Created by Igor Alves on 2016-03-19.
 */
public class MyLocalTime {

    private final int hour;
    private final int minute;
    private final int second;

    // TODO validate data
    // TODO create tests
    public MyLocalTime(String time) {

        final String[] timeArray = time.split(":");

        hour = Integer.parseInt(timeArray[0]);
        minute = Integer.parseInt(timeArray[1]);
        second = Integer.parseInt(timeArray[2]);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
