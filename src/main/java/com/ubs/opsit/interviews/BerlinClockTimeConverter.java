package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.time.Time;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Igor Alves on 2016-03-18.
 */
public class BerlinClockTimeConverter implements TimeConverter {

    private static final Logger logger = LoggerFactory.getLogger(BerlinClockTimeConverter.class);

    // constants for all characters used
    public static final char NEW_LINE = '\n';
    public static final char YELLOW = 'Y';
    public static final char OFF = 'O';
    public static final char RED = 'R';

    @Override
    public String convertTime(String timeString) {

        logger.info("timeString: " + timeString);

        final StringBuilder sb = new StringBuilder();

        sb.append(buildRoundLight(timeString));
        sb.append(NEW_LINE);
        sb.append(buildFirstLine(timeString));
        sb.append(NEW_LINE);
        sb.append(buildSecondLine(timeString));
        sb.append(NEW_LINE);
        sb.append(buildThirdLine(timeString));
        sb.append(NEW_LINE);
        sb.append(buildForthLine(timeString));

        return sb.toString();
    }

    /**
     * Creates a String for the round light on the top of the clock
     *
     * @param timeString time in the HH:mm or HH:mm:ss format
     * @return a String
     */
    protected String buildRoundLight(String timeString) {

        final Time time = new Time(timeString);

        final boolean isEven = time.getSecond() % 2 == 0;
        final char lightChar = isEven ? YELLOW : OFF;

        return String.valueOf(lightChar);
    }

    /**
     * Creates a String for the first line of the clock
     *
     * @param timeString time in the HH:mm or HH:mm:ss format
     * @return a String
     */
    protected String buildFirstLine(String timeString) {

        final Time time = new Time(timeString);
        final int numberOfRedLightsOn = time.getHour() / 5;

        return getLineString(numberOfRedLightsOn, RED);
    }

    /**
     * Creates a String for the second line of the clock
     *
     * @param timeString time in the HH:mm or HH:mm:ss format
     * @return a String
     */
    protected String buildSecondLine(String timeString) {

        final Time time = new Time(timeString);
        final int numberOfRedLightsOn = time.getHour() % 5;

        return getLineString(numberOfRedLightsOn, RED);
    }

    /**
     * Creates a String for the third line of the clock
     *
     * @param timeString time in the HH:mm or HH:mm:ss format
     * @return a String
     */
    protected String buildThirdLine(String timeString) {

        final Time time = new Time(timeString);
        final int numberOfLightsOn = time.getMinute() / 5;

        final StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 11; i++) {

            if (numberOfLightsOn >= i) {

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

    /**
     * Creates a String for the forth line of the clock
     *
     * @param timeString time in the HH:mm or HH:mm:ss format
     * @return a String
     */
    protected String buildForthLine(String timeString) {

        final Time time = new Time(timeString);
        final int numberOfYellowLightsOn = time.getMinute() % 5;

        return getLineString(numberOfYellowLightsOn, YELLOW);
    }

    /**
     * Creates a String according to the number of lights on and their color (it considers the total number of lights is 4)
     *
     * @param numberOfLightsOn number of lights on
     * @param color            color of the lights on
     * @return a String
     */
    private String getLineString(int numberOfLightsOn, char color) {

        final StringBuilder sb = new StringBuilder();

        // check for each light if should be on or off
        for (int i = 1; i <= 4; i++) {

            if (numberOfLightsOn >= i) {
                sb.append(color);
            } else {
                sb.append(OFF);
            }
        }

        return sb.toString();
    }
}
