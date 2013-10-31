package com.epam.alltogether;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AbstractCalculatorTest {

    private AbstractCalculator underTest;
    
    @Before
    public void setUp(){
        underTest = new AbstractCalculator() {
            
            @Override
            protected Integer doCalcualte(Integer a, Integer b) {
                return 0;
            }
        };
    }
    
    @Test
    public void calculateTest(){
        //GIVEN
        Integer input1 = Integer.valueOf(100);
        Integer input2 = Integer.valueOf(23);
        Integer expected = Integer.valueOf(0);
        //WHEN
        Integer actual = underTest.calculate(input1, input2);
        //THEN
        Assert.assertEquals(expected, actual);
    }
}
