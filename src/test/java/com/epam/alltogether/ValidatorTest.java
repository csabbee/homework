package com.epam.alltogether;

import org.junit.Test;

public class ValidatorTest {

    @Test(expected=IllegalArgumentException.class)
    public void validNotNullTestWhenInputIsNull(){
        //GIVEN expect exception
        //WHEN
        
        Validator.validateNotNull(null);
        //THEN exception thrown
    }
    @Test
    public void validNotNullTestWhenInputIsNOTNull(){
        //GIVEN 
        Object o = new Object();
        //WHEN
        Validator.validateNotNull(o);
        //THEN no exception thrown
    }
}
