package com.ubs.opsit.interviews;

/**
 * Created by Igor Alves on 2016-03-19.
 */
public class MyLocalTime {

    public static final int HOUR_INDEX = 0;
    public static final int MINUTE_INDEX = 1;
    public static final int SECOND_INDEX = 2;

    private final int hour;
    private final int minute;
    private final int second;

    /**
     * Constructor
     *
     * @param time String with the time using HH:mm or HH:mm:ss format
     */
    public MyLocalTime(String time) {

        final String[] timeArray = time.split(":");

        if (timeArray.length < 2 || timeArray.length > 3) {
            throw new IllegalArgumentException("The time format must be HH:mm or HH:mm:ss");
        }

        // set hour/minute
        this.hour = getValue(timeArray[HOUR_INDEX]);
        this.minute = getValue(timeArray[MINUTE_INDEX]);

        // set second checking if there is second in the parameter
        if (timeArray.length == 3) {
            this.second = getValue(timeArray[SECOND_INDEX]);
        } else {
            this.second = 0;
        }

        validateTimeValues();
    }

    /**
     * Converts a String to int, throwing an unchecked exception if it is not possible
     *
     * @param s String to be converted
     * @return An int
     */
    private int getValue(String s) {

        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("'" + s + "' " + "is not a valid number");
        }
    }

    /**
     * Validate the values for hour, minute and second
     */
    private void validateTimeValues() {

        if (hour > 24) {
            throw new IllegalArgumentException("The hour cannot be greater than 24");
        } else if (hour == 24 && (minute > 0 || second > 0)) {
            throw new IllegalArgumentException("If the hour is 24, the minute and the second must be 0");
        }

        if (minute > 59) {
            throw new IllegalArgumentException("The minute cannot be greater than 59");
        }

        if (second > 59) {
            throw new IllegalArgumentException("The second cannot be greater than 59");
        }
    }

    /* GETTERS */

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
