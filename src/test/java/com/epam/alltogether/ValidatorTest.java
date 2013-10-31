package com.epam.alltogether;

import org.junit.Test;

public class ValidatorTest {
    private Validator underTest;
    
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
    @Test(expected=UnsupportedOperationException.class)
    public void ValidatorConstructorTest(){
        //GIVEN expect exception
        //WHEN
        underTest = new Validator();
        //THEN exception thrown
        
    }
}
