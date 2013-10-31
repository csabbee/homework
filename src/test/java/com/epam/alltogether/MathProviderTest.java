package com.epam.alltogether;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;
import org.easymock.IMocksControl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathProviderTest {

    private MathProvider underTest;
    private Sum sum;
    private NumberFormatter numberformatter;
    private IMocksControl control;
    
    
    @Before
    public void setUp(){
        control = EasyMock.createControl();
        sum = control.createMock(Sum.class);
        numberformatter = control.createMock(NumberFormatter.class);
        underTest = new MathProvider();
        underTest.setCalc(sum);
    }
    
    @Test
    public void sumTest(){
        //GIVEN
        String expected = "[123]";
        List<Integer> inputList = new ArrayList<Integer>();
        Integer input1 = Integer.valueOf(100);
        Integer input2 = Integer.valueOf(23);
        inputList.add(input2);
        inputList.add(input1);
        Integer output = Integer.valueOf(123);
        EasyMock.expect(sum.doCalcualte(Integer.valueOf(0), input2)).andReturn(input2);
        EasyMock.expect(sum.doCalcualte(input2, input1)).andReturn(output);
        EasyMock.expect(sum.calculate(input1, input2)).andReturn(output);
        EasyMock.expect(numberformatter.format(output)).andReturn(expected);
        //WHEN
        control.replay();
        String actual = underTest.sum(inputList);
        //THEN
        Assert.assertEquals(expected, actual);
        
    }
}
