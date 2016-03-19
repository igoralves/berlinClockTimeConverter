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

    @Override
    public String convertTime(String aTime) {

        // TODO refactor adding this logic in a class such as BerlinClock

        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        final LocalTime time = LocalTime.parse(aTime, dateTimeFormatter);

        logger.info("aTime: " + time.toString());

        final StringBuilder sb = new StringBuilder();

        sb.append(buildRoundLight(time));
        sb.append(NEW_LINE);
        sb.append(buildFirstLine(time));
        sb.append(NEW_LINE);
        sb.append(buildSecondLine(time));
        sb.append(NEW_LINE);
        sb.append(buildThirdLine(time));
        sb.append(NEW_LINE);
        sb.append(buildForthLine(time));

        return sb.toString();
    }

    protected String buildRoundLight(LocalTime time) {

        final boolean isEven = time.getSecond() % 2 == 0;

        return isEven ? "Y" : "O";
    }

    protected String buildFirstLine(LocalTime time) {

        final int numberOfRedLights = time.getHour() / 5;
        final StringBuilder sb = new StringBuilder();


        // TODO explain what I'm doing
        for (int i = 1; i <= 4; i++) {

            if (numberOfRedLights >= i) {
                sb.append("R");
            } else {
                sb.append("O");
            }
        }

        return sb.toString();
    }

    // TODO this method is almost exactly as same as buildFirstLine...
    protected String buildSecondLine(LocalTime time) {

        final int numberOfRedLights = time.getHour() % 5;
        final StringBuilder sb = new StringBuilder();

        // TODO explain what I'm doing
        for (int i = 1; i <= 4; i++) {

            if (numberOfRedLights >= i) {
                sb.append("R");
            } else {
                sb.append("O");
            }

        }

        return sb.toString();
    }

    protected String buildThirdLine(LocalTime time) {

        final int numberOfLights = time.getMinute() / 5;
        final StringBuilder sb = new StringBuilder();

        // TODO explain what I'm doing
        for (int i = 1; i <= 11; i++) {

            if (numberOfLights >= i) {

                if (i % 3 == 0) {
                    sb.append("R");
                } else {
                    sb.append("Y");
                }

            } else {
                sb.append("O");
            }

        }

        return sb.toString();
    }

    // TODO this is very similar to buildSecondLine()!!
    protected String buildForthLine(LocalTime time) {

        final int numberOfRedLights = time.getMinute() % 5;
        final StringBuilder sb = new StringBuilder();

        // TODO explain what I'm doing
        for (int i = 1; i <= 4; i++) {

            if (numberOfRedLights >= i) {
                sb.append("Y");
            } else {
                sb.append("O");
            }

        }

        return sb.toString();
    }
}
