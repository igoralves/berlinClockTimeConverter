package com.ubs.opsit.interviews;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Igor Alves on 2016-03-18.
 */
public class BerlinClockTimeConverter implements TimeConverter {

    private static final Logger logger = LoggerFactory.getLogger(BerlinClockTimeConverter.class);

    public static final String NEW_LINE = "\n";
    public static final String YELLOW = "Y";
    public static final String OFF = "O";
    public static final String RED = "R";

    @Override
    public String convertTime(String aTime) {

        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        final LocalTime time = LocalTime.parse(aTime, dateTimeFormatter);

        logger.info("aTime: " + time.toString());

        final StringBuilder sb = new StringBuilder();

        sb.append(buildRoundLight(aTime));
        sb.append(NEW_LINE);
        sb.append(buildFirstLine(aTime));
        sb.append(NEW_LINE);
        sb.append(buildSecondLine(aTime));
        sb.append(NEW_LINE);
        sb.append(buildThirdLine(aTime));
        sb.append(NEW_LINE);
        sb.append(buildForthLine(aTime));

        return sb.toString();
    }

    protected String buildRoundLight(String time) {

        final MyLocalTime myLocalTime = new MyLocalTime(time);

        final boolean isEven = myLocalTime.getSecond() % 2 == 0;

        return isEven ? YELLOW : OFF;
    }

    protected String buildFirstLine(String time) {

        final MyLocalTime myLocalTime = new MyLocalTime(time);

        final int numberOfRedLights = myLocalTime.getHour() / 5;
        final StringBuilder sb = new StringBuilder();


        // TODO explain what I'm doing
        for (int i = 1; i <= 4; i++) {

            if (numberOfRedLights >= i) {
                sb.append(RED);
            } else {
                sb.append(OFF);
            }
        }

        return sb.toString();
    }

    // TODO this method is almost exactly as same as buildFirstLine...
    protected String buildSecondLine(String time) {

        final MyLocalTime myLocalTime = new MyLocalTime(time);

        final int numberOfRedLights = myLocalTime.getHour() % 5;
        final StringBuilder sb = new StringBuilder();

        // TODO explain what I'm doing
        for (int i = 1; i <= 4; i++) {

            if (numberOfRedLights >= i) {
                sb.append(RED);
            } else {
                sb.append(OFF);
            }

        }

        return sb.toString();
    }

    protected String buildThirdLine(String time) {

        final MyLocalTime myLocalTime = new MyLocalTime(time);

        final int numberOfLights = myLocalTime.getMinute() / 5;
        final StringBuilder sb = new StringBuilder();

        // TODO explain what I'm doing
        for (int i = 1; i <= 11; i++) {

            if (numberOfLights >= i) {

                if (i % 3 == 0) {
                    sb.append(RED);
                } else {
                    sb.append(YELLOW);
                }

            } else {
                sb.append(OFF);
            }

        }

        return sb.toString();
    }

    // TODO this is very similar to buildSecondLine()!!
    protected String buildForthLine(String time) {

        final MyLocalTime myLocalTime = new MyLocalTime(time);

        final int numberOfRedLights = myLocalTime.getMinute() % 5;
        final StringBuilder sb = new StringBuilder();

        // TODO explain what I'm doing
        for (int i = 1; i <= 4; i++) {

            if (numberOfRedLights >= i) {
                sb.append(YELLOW);
            } else {
                sb.append(OFF);
            }

        }

        return sb.toString();
    }
}
