package com.epam.alltogether;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SumTest {

    private Sum sum;
    
    @Before
    public void setUp(){
        sum = new Sum();
    }
    
    @Test
    public void doCalculateTest(){
        //GIVEN 
        Integer input1 = Integer.valueOf(100);
        Integer input2 = Integer.valueOf(23);
        Integer expected = Integer.valueOf(123);
        //WHEN
        Integer actual = sum.doCalcualte(input1, input2);
        //THEN
        Assert.assertEquals(expected, actual);
    }
}
