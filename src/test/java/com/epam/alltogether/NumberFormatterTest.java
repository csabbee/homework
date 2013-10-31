package com.epam.alltogether;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberFormatterTest {

    private NumberFormatter underTest;
    @Before
    public void setUp(){
        underTest = new NumberFormatter();
    }
    @Test
    public void formatTest(){
        //GIVEN
        String expected = "[123]";
        //WHEN
        String actual = underTest.format(123);
        //THEN
        Assert.assertEquals(expected, actual);
    }
}
