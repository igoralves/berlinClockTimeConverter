package com.ubs.opsit.interviews;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

/**
 * Created by Igor Alves on 2016-03-18.
 */
public class BerlinClockTimeConverterTest {

    private BerlinClockTimeConverter converter;

    @Before
    public void createBerlinClockTimeConverter() {
        converter = new BerlinClockTimeConverter();
    }

    // TODO consider create a @Before method...

    @Test
    public void buildRoundLight() {

        // on for even numbers
        assertEquals("Y", converter.buildRoundLight(LocalTime.of(0, 0, 0)));
        assertEquals("Y", converter.buildRoundLight(LocalTime.of(0, 1, 0)));
        assertEquals("Y", converter.buildRoundLight(LocalTime.of(0, 2, 0)));
        assertEquals("Y", converter.buildRoundLight(LocalTime.of(1, 0, 0)));
        assertEquals("Y", converter.buildRoundLight(LocalTime.of(2, 0, 0)));

        // off for odd numbers
        assertEquals("O", converter.buildRoundLight(LocalTime.of(0, 1, 1)));
        assertEquals("O", converter.buildRoundLight(LocalTime.of(0, 1, 1)));
        assertEquals("O", converter.buildRoundLight(LocalTime.of(0, 2, 1)));
        assertEquals("O", converter.buildRoundLight(LocalTime.of(1, 0, 1)));
        assertEquals("O", converter.buildRoundLight(LocalTime.of(2, 0, 1)));
    }

    @Test
    public void buildFirstLine() {

        // testing all possible hours
        assertEquals("OOOO", converter.buildFirstLine(LocalTime.of(0, 0, 0)));
        assertEquals("OOOO", converter.buildFirstLine(LocalTime.of(1, 0, 0)));
        assertEquals("OOOO", converter.buildFirstLine(LocalTime.of(2, 0, 0)));
        assertEquals("OOOO", converter.buildFirstLine(LocalTime.of(3, 0, 0)));
        assertEquals("OOOO", converter.buildFirstLine(LocalTime.of(4, 0, 0)));
        assertEquals("ROOO", converter.buildFirstLine(LocalTime.of(5, 0, 0)));
        assertEquals("ROOO", converter.buildFirstLine(LocalTime.of(6, 0, 0)));
        assertEquals("ROOO", converter.buildFirstLine(LocalTime.of(7, 0, 0)));
        assertEquals("ROOO", converter.buildFirstLine(LocalTime.of(8, 0, 0)));
        assertEquals("ROOO", converter.buildFirstLine(LocalTime.of(9, 0, 0)));
        assertEquals("RROO", converter.buildFirstLine(LocalTime.of(10, 0, 0)));
        assertEquals("RROO", converter.buildFirstLine(LocalTime.of(11, 0, 0)));
        assertEquals("RROO", converter.buildFirstLine(LocalTime.of(12, 0, 0)));
        assertEquals("RROO", converter.buildFirstLine(LocalTime.of(13, 0, 0)));
        assertEquals("RROO", converter.buildFirstLine(LocalTime.of(14, 0, 0)));
        assertEquals("RRRO", converter.buildFirstLine(LocalTime.of(15, 0, 0)));
        assertEquals("RRRO", converter.buildFirstLine(LocalTime.of(16, 0, 0)));
        assertEquals("RRRO", converter.buildFirstLine(LocalTime.of(17, 0, 0)));
        assertEquals("RRRO", converter.buildFirstLine(LocalTime.of(18, 0, 0)));
        assertEquals("RRRO", converter.buildFirstLine(LocalTime.of(19, 0, 0)));
        assertEquals("RRRR", converter.buildFirstLine(LocalTime.of(20, 0, 0)));
        assertEquals("RRRR", converter.buildFirstLine(LocalTime.of(21, 0, 0)));
        assertEquals("RRRR", converter.buildFirstLine(LocalTime.of(22, 0, 0)));
        assertEquals("RRRR", converter.buildFirstLine(LocalTime.of(23, 0, 0)));

    }

    @Test
    public void buildSecondLine() {

        // testing all possible hours
        assertEquals("OOOO", converter.buildSecondLine(LocalTime.of(0, 0, 0)));
        assertEquals("ROOO", converter.buildSecondLine(LocalTime.of(1, 0, 0)));
        assertEquals("RROO", converter.buildSecondLine(LocalTime.of(2, 0, 0)));
        assertEquals("RRRO", converter.buildSecondLine(LocalTime.of(3, 0, 0)));
        assertEquals("RRRR", converter.buildSecondLine(LocalTime.of(4, 0, 0)));
        assertEquals("OOOO", converter.buildSecondLine(LocalTime.of(5, 0, 0)));
        assertEquals("ROOO", converter.buildSecondLine(LocalTime.of(6, 0, 0)));
        assertEquals("RROO", converter.buildSecondLine(LocalTime.of(7, 0, 0)));
        assertEquals("RRRO", converter.buildSecondLine(LocalTime.of(8, 0, 0)));
        assertEquals("RRRR", converter.buildSecondLine(LocalTime.of(9, 0, 0)));
        assertEquals("OOOO", converter.buildSecondLine(LocalTime.of(10, 0, 0)));
        assertEquals("ROOO", converter.buildSecondLine(LocalTime.of(11, 0, 0)));
        assertEquals("RROO", converter.buildSecondLine(LocalTime.of(12, 0, 0)));
        assertEquals("RRRO", converter.buildSecondLine(LocalTime.of(13, 0, 0)));
        assertEquals("RRRR", converter.buildSecondLine(LocalTime.of(14, 0, 0)));
        assertEquals("OOOO", converter.buildSecondLine(LocalTime.of(15, 0, 0)));
        assertEquals("ROOO", converter.buildSecondLine(LocalTime.of(16, 0, 0)));
        assertEquals("RROO", converter.buildSecondLine(LocalTime.of(17, 0, 0)));
        assertEquals("RRRO", converter.buildSecondLine(LocalTime.of(18, 0, 0)));
        assertEquals("RRRR", converter.buildSecondLine(LocalTime.of(19, 0, 0)));
        assertEquals("OOOO", converter.buildSecondLine(LocalTime.of(20, 0, 0)));
        assertEquals("ROOO", converter.buildSecondLine(LocalTime.of(21, 0, 0)));
        assertEquals("RROO", converter.buildSecondLine(LocalTime.of(22, 0, 0)));
        assertEquals("RRRO", converter.buildSecondLine(LocalTime.of(23, 0, 0)));
    }

    @Test
    public void buildThirdLine() {

        // testing all possible minutes
        assertEquals("OOOOOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 0, 0)));
        assertEquals("OOOOOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 1, 0)));
        assertEquals("OOOOOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 2, 0)));
        assertEquals("OOOOOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 3, 0)));
        assertEquals("OOOOOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 4, 0)));
        assertEquals("YOOOOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 5, 0)));
        assertEquals("YOOOOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 6, 0)));
        assertEquals("YOOOOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 7, 0)));
        assertEquals("YOOOOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 8, 0)));
        assertEquals("YOOOOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 9, 0)));
        assertEquals("YYOOOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 10, 0)));
        assertEquals("YYOOOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 11, 0)));
        assertEquals("YYOOOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 12, 0)));
        assertEquals("YYOOOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 13, 0)));
        assertEquals("YYOOOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 14, 0)));
        assertEquals("YYROOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 15, 0)));
        assertEquals("YYROOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 16, 0)));
        assertEquals("YYROOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 17, 0)));
        assertEquals("YYROOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 18, 0)));
        assertEquals("YYROOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 19, 0)));
        assertEquals("YYRYOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 20, 0)));
        assertEquals("YYRYOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 21, 0)));
        assertEquals("YYRYOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 22, 0)));
        assertEquals("YYRYOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 23, 0)));
        assertEquals("YYRYOOOOOOO", converter.buildThirdLine(LocalTime.of(0, 24, 0)));
        assertEquals("YYRYYOOOOOO", converter.buildThirdLine(LocalTime.of(0, 25, 0)));
        assertEquals("YYRYYOOOOOO", converter.buildThirdLine(LocalTime.of(0, 26, 0)));
        assertEquals("YYRYYOOOOOO", converter.buildThirdLine(LocalTime.of(0, 27, 0)));
        assertEquals("YYRYYOOOOOO", converter.buildThirdLine(LocalTime.of(0, 28, 0)));
        assertEquals("YYRYYOOOOOO", converter.buildThirdLine(LocalTime.of(0, 29, 0)));
        assertEquals("YYRYYROOOOO", converter.buildThirdLine(LocalTime.of(0, 30, 0)));
        assertEquals("YYRYYROOOOO", converter.buildThirdLine(LocalTime.of(0, 31, 0)));
        assertEquals("YYRYYROOOOO", converter.buildThirdLine(LocalTime.of(0, 32, 0)));
        assertEquals("YYRYYROOOOO", converter.buildThirdLine(LocalTime.of(0, 33, 0)));
        assertEquals("YYRYYROOOOO", converter.buildThirdLine(LocalTime.of(0, 34, 0)));
        assertEquals("YYRYYRYOOOO", converter.buildThirdLine(LocalTime.of(0, 35, 0)));
        assertEquals("YYRYYRYOOOO", converter.buildThirdLine(LocalTime.of(0, 36, 0)));
        assertEquals("YYRYYRYOOOO", converter.buildThirdLine(LocalTime.of(0, 37, 0)));
        assertEquals("YYRYYRYOOOO", converter.buildThirdLine(LocalTime.of(0, 38, 0)));
        assertEquals("YYRYYRYOOOO", converter.buildThirdLine(LocalTime.of(0, 39, 0)));
        assertEquals("YYRYYRYYOOO", converter.buildThirdLine(LocalTime.of(0, 40, 0)));
        assertEquals("YYRYYRYYOOO", converter.buildThirdLine(LocalTime.of(0, 41, 0)));
        assertEquals("YYRYYRYYOOO", converter.buildThirdLine(LocalTime.of(0, 42, 0)));
        assertEquals("YYRYYRYYOOO", converter.buildThirdLine(LocalTime.of(0, 43, 0)));
        assertEquals("YYRYYRYYOOO", converter.buildThirdLine(LocalTime.of(0, 44, 0)));
        assertEquals("YYRYYRYYROO", converter.buildThirdLine(LocalTime.of(0, 45, 0)));
        assertEquals("YYRYYRYYROO", converter.buildThirdLine(LocalTime.of(0, 46, 0)));
        assertEquals("YYRYYRYYROO", converter.buildThirdLine(LocalTime.of(0, 47, 0)));
        assertEquals("YYRYYRYYROO", converter.buildThirdLine(LocalTime.of(0, 48, 0)));
        assertEquals("YYRYYRYYROO", converter.buildThirdLine(LocalTime.of(0, 49, 0)));
        assertEquals("YYRYYRYYRYO", converter.buildThirdLine(LocalTime.of(0, 50, 0)));
        assertEquals("YYRYYRYYRYO", converter.buildThirdLine(LocalTime.of(0, 51, 0)));
        assertEquals("YYRYYRYYRYO", converter.buildThirdLine(LocalTime.of(0, 52, 0)));
        assertEquals("YYRYYRYYRYO", converter.buildThirdLine(LocalTime.of(0, 53, 0)));
        assertEquals("YYRYYRYYRYO", converter.buildThirdLine(LocalTime.of(0, 54, 0)));
        assertEquals("YYRYYRYYRYY", converter.buildThirdLine(LocalTime.of(0, 55, 0)));
        assertEquals("YYRYYRYYRYY", converter.buildThirdLine(LocalTime.of(0, 56, 0)));
        assertEquals("YYRYYRYYRYY", converter.buildThirdLine(LocalTime.of(0, 57, 0)));
        assertEquals("YYRYYRYYRYY", converter.buildThirdLine(LocalTime.of(0, 58, 0)));
        assertEquals("YYRYYRYYRYY", converter.buildThirdLine(LocalTime.of(0, 59, 0)));
    }

    @Test
    public void buildForthLine() {

        // testing all possible minutes
        assertEquals("OOOO", converter.buildForthLine(LocalTime.of(0, 0, 0)));
        assertEquals("YOOO", converter.buildForthLine(LocalTime.of(0, 1, 0)));
        assertEquals("YYOO", converter.buildForthLine(LocalTime.of(0, 2, 0)));
        assertEquals("YYYO", converter.buildForthLine(LocalTime.of(0, 3, 0)));
        assertEquals("YYYY", converter.buildForthLine(LocalTime.of(0, 4, 0)));
        assertEquals("OOOO", converter.buildForthLine(LocalTime.of(0, 5, 0)));
        assertEquals("YOOO", converter.buildForthLine(LocalTime.of(0, 6, 0)));
        assertEquals("YYOO", converter.buildForthLine(LocalTime.of(0, 7, 0)));
        assertEquals("YYYO", converter.buildForthLine(LocalTime.of(0, 8, 0)));
        assertEquals("YYYY", converter.buildForthLine(LocalTime.of(0, 9, 0)));
        assertEquals("OOOO", converter.buildForthLine(LocalTime.of(0, 10, 0)));
        assertEquals("YOOO", converter.buildForthLine(LocalTime.of(0, 11, 0)));
        assertEquals("YYOO", converter.buildForthLine(LocalTime.of(0, 12, 0)));
        assertEquals("YYYO", converter.buildForthLine(LocalTime.of(0, 13, 0)));
        assertEquals("YYYY", converter.buildForthLine(LocalTime.of(0, 14, 0)));
        assertEquals("OOOO", converter.buildForthLine(LocalTime.of(0, 15, 0)));
        assertEquals("YOOO", converter.buildForthLine(LocalTime.of(0, 16, 0)));
        assertEquals("YYOO", converter.buildForthLine(LocalTime.of(0, 17, 0)));
        assertEquals("YYYO", converter.buildForthLine(LocalTime.of(0, 18, 0)));
        assertEquals("YYYY", converter.buildForthLine(LocalTime.of(0, 19, 0)));
        assertEquals("OOOO", converter.buildForthLine(LocalTime.of(0, 20, 0)));
        assertEquals("YOOO", converter.buildForthLine(LocalTime.of(0, 21, 0)));
        assertEquals("YYOO", converter.buildForthLine(LocalTime.of(0, 22, 0)));
        assertEquals("YYYO", converter.buildForthLine(LocalTime.of(0, 23, 0)));
        assertEquals("YYYY", converter.buildForthLine(LocalTime.of(0, 24, 0)));
        assertEquals("OOOO", converter.buildForthLine(LocalTime.of(0, 25, 0)));
        assertEquals("YOOO", converter.buildForthLine(LocalTime.of(0, 26, 0)));
        assertEquals("YYOO", converter.buildForthLine(LocalTime.of(0, 27, 0)));
        assertEquals("YYYO", converter.buildForthLine(LocalTime.of(0, 28, 0)));
        assertEquals("YYYY", converter.buildForthLine(LocalTime.of(0, 29, 0)));
        assertEquals("OOOO", converter.buildForthLine(LocalTime.of(0, 30, 0)));
        assertEquals("YOOO", converter.buildForthLine(LocalTime.of(0, 31, 0)));
        assertEquals("YYOO", converter.buildForthLine(LocalTime.of(0, 32, 0)));
        assertEquals("YYYO", converter.buildForthLine(LocalTime.of(0, 33, 0)));
        assertEquals("YYYY", converter.buildForthLine(LocalTime.of(0, 34, 0)));
        assertEquals("OOOO", converter.buildForthLine(LocalTime.of(0, 35, 0)));
        assertEquals("YOOO", converter.buildForthLine(LocalTime.of(0, 36, 0)));
        assertEquals("YYOO", converter.buildForthLine(LocalTime.of(0, 37, 0)));
        assertEquals("YYYO", converter.buildForthLine(LocalTime.of(0, 38, 0)));
        assertEquals("YYYY", converter.buildForthLine(LocalTime.of(0, 39, 0)));
        assertEquals("OOOO", converter.buildForthLine(LocalTime.of(0, 40, 0)));
        assertEquals("YOOO", converter.buildForthLine(LocalTime.of(0, 41, 0)));
        assertEquals("YYOO", converter.buildForthLine(LocalTime.of(0, 42, 0)));
        assertEquals("YYYO", converter.buildForthLine(LocalTime.of(0, 43, 0)));
        assertEquals("YYYY", converter.buildForthLine(LocalTime.of(0, 44, 0)));
        assertEquals("OOOO", converter.buildForthLine(LocalTime.of(0, 45, 0)));
        assertEquals("YOOO", converter.buildForthLine(LocalTime.of(0, 46, 0)));
        assertEquals("YYOO", converter.buildForthLine(LocalTime.of(0, 47, 0)));
        assertEquals("YYYO", converter.buildForthLine(LocalTime.of(0, 48, 0)));
        assertEquals("YYYY", converter.buildForthLine(LocalTime.of(0, 49, 0)));
        assertEquals("OOOO", converter.buildForthLine(LocalTime.of(0, 50, 0)));
        assertEquals("YOOO", converter.buildForthLine(LocalTime.of(0, 51, 0)));
        assertEquals("YYOO", converter.buildForthLine(LocalTime.of(0, 52, 0)));
        assertEquals("YYYO", converter.buildForthLine(LocalTime.of(0, 53, 0)));
        assertEquals("YYYY", converter.buildForthLine(LocalTime.of(0, 54, 0)));
        assertEquals("OOOO", converter.buildForthLine(LocalTime.of(0, 55, 0)));
        assertEquals("YOOO", converter.buildForthLine(LocalTime.of(0, 56, 0)));
        assertEquals("YYOO", converter.buildForthLine(LocalTime.of(0, 57, 0)));
        assertEquals("YYYO", converter.buildForthLine(LocalTime.of(0, 58, 0)));
        assertEquals("YYYY", converter.buildForthLine(LocalTime.of(0, 59, 0)));
    }
}