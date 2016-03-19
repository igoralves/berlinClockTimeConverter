package com.ubs.opsit.interviews;

import org.junit.Before;
import org.junit.Test;

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

    @Test
    public void buildRoundLight() {

        // on for even numbers
        assertEquals("Y", converter.buildRoundLight("00:00:00"));
        assertEquals("Y", converter.buildRoundLight("00:01:00"));
        assertEquals("Y", converter.buildRoundLight("00:02:00"));
        assertEquals("Y", converter.buildRoundLight("01:00:00"));
        assertEquals("Y", converter.buildRoundLight("02:00:00"));

        // off for odd numbers
        assertEquals("O", converter.buildRoundLight("00:00:01"));
        assertEquals("O", converter.buildRoundLight("00:01:01"));
        assertEquals("O", converter.buildRoundLight("00:02:01"));
        assertEquals("O", converter.buildRoundLight("01:00:01"));
        assertEquals("O", converter.buildRoundLight("02:00:01"));
    }

    @Test
    public void buildFirstLine() {

        // testing all possible hours
        assertEquals("OOOO", converter.buildFirstLine("00:00:00"));
        assertEquals("OOOO", converter.buildFirstLine("01:00:00"));
        assertEquals("OOOO", converter.buildFirstLine("02:00:00"));
        assertEquals("OOOO", converter.buildFirstLine("03:00:00"));
        assertEquals("OOOO", converter.buildFirstLine("04:00:00"));
        assertEquals("ROOO", converter.buildFirstLine("5:00:00"));
        assertEquals("ROOO", converter.buildFirstLine("6:00:00"));
        assertEquals("ROOO", converter.buildFirstLine("7:00:00"));
        assertEquals("ROOO", converter.buildFirstLine("8:00:00"));
        assertEquals("ROOO", converter.buildFirstLine("9:00:00"));
        assertEquals("RROO", converter.buildFirstLine("10:00:00"));
        assertEquals("RROO", converter.buildFirstLine("11:00:00"));
        assertEquals("RROO", converter.buildFirstLine("12:00:00"));
        assertEquals("RROO", converter.buildFirstLine("13:00:00"));
        assertEquals("RROO", converter.buildFirstLine("14:00:00"));
        assertEquals("RRRO", converter.buildFirstLine("15:00:00"));
        assertEquals("RRRO", converter.buildFirstLine("16:00:00"));
        assertEquals("RRRO", converter.buildFirstLine("17:00:00"));
        assertEquals("RRRO", converter.buildFirstLine("18:00:00"));
        assertEquals("RRRO", converter.buildFirstLine("19:00:00"));
        assertEquals("RRRR", converter.buildFirstLine("20:00:00"));
        assertEquals("RRRR", converter.buildFirstLine("21:00:00"));
        assertEquals("RRRR", converter.buildFirstLine("22:00:00"));
        assertEquals("RRRR", converter.buildFirstLine("23:00:00"));
        assertEquals("RRRR", converter.buildFirstLine("24:00:00"));
    }

    @Test
    public void buildSecondLine() {

        // testing all possible hours
        assertEquals("OOOO", converter.buildSecondLine("00:00:00"));
        assertEquals("ROOO", converter.buildSecondLine("01:00:00"));
        assertEquals("RROO", converter.buildSecondLine("02:00:00"));
        assertEquals("RRRO", converter.buildSecondLine("03:00:00"));
        assertEquals("RRRR", converter.buildSecondLine("04:00:00"));
        assertEquals("OOOO", converter.buildSecondLine("05:00:00"));
        assertEquals("ROOO", converter.buildSecondLine("06:00:00"));
        assertEquals("RROO", converter.buildSecondLine("07:00:00"));
        assertEquals("RRRO", converter.buildSecondLine("08:00:00"));
        assertEquals("RRRR", converter.buildSecondLine("09:00:00"));
        assertEquals("OOOO", converter.buildSecondLine("10:00:00"));
        assertEquals("ROOO", converter.buildSecondLine("11:00:00"));
        assertEquals("RROO", converter.buildSecondLine("12:00:00"));
        assertEquals("RRRO", converter.buildSecondLine("13:00:00"));
        assertEquals("RRRR", converter.buildSecondLine("14:00:00"));
        assertEquals("OOOO", converter.buildSecondLine("15:00:00"));
        assertEquals("ROOO", converter.buildSecondLine("16:00:00"));
        assertEquals("RROO", converter.buildSecondLine("17:00:00"));
        assertEquals("RRRO", converter.buildSecondLine("18:00:00"));
        assertEquals("RRRR", converter.buildSecondLine("19:00:00"));
        assertEquals("OOOO", converter.buildSecondLine("20:00:00"));
        assertEquals("ROOO", converter.buildSecondLine("21:00:00"));
        assertEquals("RROO", converter.buildSecondLine("22:00:00"));
        assertEquals("RRRO", converter.buildSecondLine("23:00:00"));
        assertEquals("RRRR", converter.buildSecondLine("24:00:00"));
    }

    @Test
    public void buildThirdLine() {

        // testing all possible minutes
        assertEquals("OOOOOOOOOOO", converter.buildThirdLine("00:00:00"));
        assertEquals("OOOOOOOOOOO", converter.buildThirdLine("00:01:00:"));
        assertEquals("OOOOOOOOOOO", converter.buildThirdLine("00:02:00"));
        assertEquals("OOOOOOOOOOO", converter.buildThirdLine("00:03:00"));
        assertEquals("OOOOOOOOOOO", converter.buildThirdLine("00:04:00"));
        assertEquals("YOOOOOOOOOO", converter.buildThirdLine("00:05:00"));
        assertEquals("YOOOOOOOOOO", converter.buildThirdLine("00:06:00"));
        assertEquals("YOOOOOOOOOO", converter.buildThirdLine("00:07:00"));
        assertEquals("YOOOOOOOOOO", converter.buildThirdLine("00:08:00"));
        assertEquals("YOOOOOOOOOO", converter.buildThirdLine("00:09:00"));
        assertEquals("YYOOOOOOOOO", converter.buildThirdLine("00:10:00"));
        assertEquals("YYOOOOOOOOO", converter.buildThirdLine("00:11:00"));
        assertEquals("YYOOOOOOOOO", converter.buildThirdLine("00:12:00"));
        assertEquals("YYOOOOOOOOO", converter.buildThirdLine("00:13:00"));
        assertEquals("YYOOOOOOOOO", converter.buildThirdLine("00:14:00"));
        assertEquals("YYROOOOOOOO", converter.buildThirdLine("00:15:00"));
        assertEquals("YYROOOOOOOO", converter.buildThirdLine("00:16:00"));
        assertEquals("YYROOOOOOOO", converter.buildThirdLine("00:17:00"));
        assertEquals("YYROOOOOOOO", converter.buildThirdLine("00:18:00"));
        assertEquals("YYROOOOOOOO", converter.buildThirdLine("00:19:00"));
        assertEquals("YYRYOOOOOOO", converter.buildThirdLine("00:20:00"));
        assertEquals("YYRYOOOOOOO", converter.buildThirdLine("00:21:00"));
        assertEquals("YYRYOOOOOOO", converter.buildThirdLine("00:22:00"));
        assertEquals("YYRYOOOOOOO", converter.buildThirdLine("00:23:00"));
        assertEquals("YYRYOOOOOOO", converter.buildThirdLine("00:24:00"));
        assertEquals("YYRYYOOOOOO", converter.buildThirdLine("00:25:00"));
        assertEquals("YYRYYOOOOOO", converter.buildThirdLine("00:26:00"));
        assertEquals("YYRYYOOOOOO", converter.buildThirdLine("00:27:00"));
        assertEquals("YYRYYOOOOOO", converter.buildThirdLine("00:28:00"));
        assertEquals("YYRYYOOOOOO", converter.buildThirdLine("00:29:00"));
        assertEquals("YYRYYROOOOO", converter.buildThirdLine("00:30:00"));
        assertEquals("YYRYYROOOOO", converter.buildThirdLine("00:31:00"));
        assertEquals("YYRYYROOOOO", converter.buildThirdLine("00:32:00"));
        assertEquals("YYRYYROOOOO", converter.buildThirdLine("00:33:00"));
        assertEquals("YYRYYROOOOO", converter.buildThirdLine("00:34:00"));
        assertEquals("YYRYYRYOOOO", converter.buildThirdLine("00:35:00"));
        assertEquals("YYRYYRYOOOO", converter.buildThirdLine("00:36:00"));
        assertEquals("YYRYYRYOOOO", converter.buildThirdLine("00:37:00"));
        assertEquals("YYRYYRYOOOO", converter.buildThirdLine("00:38:00"));
        assertEquals("YYRYYRYOOOO", converter.buildThirdLine("00:39:00"));
        assertEquals("YYRYYRYYOOO", converter.buildThirdLine("00:40:00"));
        assertEquals("YYRYYRYYOOO", converter.buildThirdLine("00:41:00"));
        assertEquals("YYRYYRYYOOO", converter.buildThirdLine("00:42:00"));
        assertEquals("YYRYYRYYOOO", converter.buildThirdLine("00:43:00"));
        assertEquals("YYRYYRYYOOO", converter.buildThirdLine("00:44:00"));
        assertEquals("YYRYYRYYROO", converter.buildThirdLine("00:45:00"));
        assertEquals("YYRYYRYYROO", converter.buildThirdLine("00:46:00"));
        assertEquals("YYRYYRYYROO", converter.buildThirdLine("00:47:00"));
        assertEquals("YYRYYRYYROO", converter.buildThirdLine("00:48:00"));
        assertEquals("YYRYYRYYROO", converter.buildThirdLine("00:49:00"));
        assertEquals("YYRYYRYYRYO", converter.buildThirdLine("00:50:00"));
        assertEquals("YYRYYRYYRYO", converter.buildThirdLine("00:51:00"));
        assertEquals("YYRYYRYYRYO", converter.buildThirdLine("00:52:00"));
        assertEquals("YYRYYRYYRYO", converter.buildThirdLine("00:53:00"));
        assertEquals("YYRYYRYYRYO", converter.buildThirdLine("00:54:00"));
        assertEquals("YYRYYRYYRYY", converter.buildThirdLine("00:55:00"));
        assertEquals("YYRYYRYYRYY", converter.buildThirdLine("00:56:00"));
        assertEquals("YYRYYRYYRYY", converter.buildThirdLine("00:57:00"));
        assertEquals("YYRYYRYYRYY", converter.buildThirdLine("00:58:00"));
        assertEquals("YYRYYRYYRYY", converter.buildThirdLine("00:59:00"));
    }

    @Test
    public void buildForthLine() {

        // testing all possible minutes
        assertEquals("OOOO", converter.buildForthLine("00:00:00"));
        assertEquals("YOOO", converter.buildForthLine("00:01:00:"));
        assertEquals("YYOO", converter.buildForthLine("00:02:00"));
        assertEquals("YYYO", converter.buildForthLine("00:03:00"));
        assertEquals("YYYY", converter.buildForthLine("00:04:00"));
        assertEquals("OOOO", converter.buildForthLine("00:05:00"));
        assertEquals("YOOO", converter.buildForthLine("00:06:00"));
        assertEquals("YYOO", converter.buildForthLine("00:07:00"));
        assertEquals("YYYO", converter.buildForthLine("00:08:00"));
        assertEquals("YYYY", converter.buildForthLine("00:09:00"));
        assertEquals("OOOO", converter.buildForthLine("00:10:00"));
        assertEquals("YOOO", converter.buildForthLine("00:11:00"));
        assertEquals("YYOO", converter.buildForthLine("00:12:00"));
        assertEquals("YYYO", converter.buildForthLine("00:13:00"));
        assertEquals("YYYY", converter.buildForthLine("00:14:00"));
        assertEquals("OOOO", converter.buildForthLine("00:15:00"));
        assertEquals("YOOO", converter.buildForthLine("00:16:00"));
        assertEquals("YYOO", converter.buildForthLine("00:17:00"));
        assertEquals("YYYO", converter.buildForthLine("00:18:00"));
        assertEquals("YYYY", converter.buildForthLine("00:19:00"));
        assertEquals("OOOO", converter.buildForthLine("00:20:00"));
        assertEquals("YOOO", converter.buildForthLine("00:21:00"));
        assertEquals("YYOO", converter.buildForthLine("00:22:00"));
        assertEquals("YYYO", converter.buildForthLine("00:23:00"));
        assertEquals("YYYY", converter.buildForthLine("00:24:00"));
        assertEquals("OOOO", converter.buildForthLine("00:25:00"));
        assertEquals("YOOO", converter.buildForthLine("00:26:00"));
        assertEquals("YYOO", converter.buildForthLine("00:27:00"));
        assertEquals("YYYO", converter.buildForthLine("00:28:00"));
        assertEquals("YYYY", converter.buildForthLine("00:29:00"));
        assertEquals("OOOO", converter.buildForthLine("00:30:00"));
        assertEquals("YOOO", converter.buildForthLine("00:31:00"));
        assertEquals("YYOO", converter.buildForthLine("00:32:00"));
        assertEquals("YYYO", converter.buildForthLine("00:33:00"));
        assertEquals("YYYY", converter.buildForthLine("00:34:00"));
        assertEquals("OOOO", converter.buildForthLine("00:35:00"));
        assertEquals("YOOO", converter.buildForthLine("00:36:00"));
        assertEquals("YYOO", converter.buildForthLine("00:37:00"));
        assertEquals("YYYO", converter.buildForthLine("00:38:00"));
        assertEquals("YYYY", converter.buildForthLine("00:39:00"));
        assertEquals("OOOO", converter.buildForthLine("00:40:00"));
        assertEquals("YOOO", converter.buildForthLine("00:41:00"));
        assertEquals("YYOO", converter.buildForthLine("00:42:00"));
        assertEquals("YYYO", converter.buildForthLine("00:43:00"));
        assertEquals("YYYY", converter.buildForthLine("00:44:00"));
        assertEquals("OOOO", converter.buildForthLine("00:45:00"));
        assertEquals("YOOO", converter.buildForthLine("00:46:00"));
        assertEquals("YYOO", converter.buildForthLine("00:47:00"));
        assertEquals("YYYO", converter.buildForthLine("00:48:00"));
        assertEquals("YYYY", converter.buildForthLine("00:49:00"));
        assertEquals("OOOO", converter.buildForthLine("00:50:00"));
        assertEquals("YOOO", converter.buildForthLine("00:51:00"));
        assertEquals("YYOO", converter.buildForthLine("00:52:00"));
        assertEquals("YYYO", converter.buildForthLine("00:53:00"));
        assertEquals("YYYY", converter.buildForthLine("00:54:00"));
        assertEquals("OOOO", converter.buildForthLine("00:55:00"));
        assertEquals("YOOO", converter.buildForthLine("00:56:00"));
        assertEquals("YYOO", converter.buildForthLine("00:57:00"));
        assertEquals("YYYO", converter.buildForthLine("00:58:00"));
        assertEquals("YYYY", converter.buildForthLine("00:59:00"));
    }
}