package com.wipro.topgear;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldReverseNormalString() {
        String input = "TopGear-Standalone Maven";
        String expected = "nevaM enalodnatS-raeGpoT";
        String actual = StringUtils.reverse(input);
        System.out.println(actual);
        assertNotEquals(expected.trim(), actual.trim());
    }
}
