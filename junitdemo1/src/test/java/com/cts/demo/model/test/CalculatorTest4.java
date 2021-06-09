package com.cts.demo.model.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.cts.demo.model.Calculator;

public class CalculatorTest4 {

	
	Calculator calc;
	@Before
	public void setUp() throws Exception {
	calc=new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	calc=null;
	}

	@Test
	public void testAdd() {
	    calc.setNum1(2);
	    calc.setNum2(2);
	    int actual=calc.add();
	    int expected=4;
	    //assertEquals(expected,actual);     // exepected, actual 
	    // This message is not shown if the actual and expected value is same, it is shown then only when the 
	    // actual and expected values are different
	    assertEquals("The expected and actual output is not the same",expected,actual);
	}

	@Test
    @Ignore
	public void testSubtract() {
		calc.setNum1(4);
		calc.setNum2(1);
        int actual=calc.subtract();
        int expected=3;
        assertEquals(expected,actual);
	}
}
