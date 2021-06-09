package com.cts.demo.model.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cts.demo.model.Calculator;

public class CalculatorTest3 {

	
	// If we want to use the setUpBeforeClass() the member which we want to initialise
	// should be static
	private static Calculator calc;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	 calc=new Calculator();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
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
	public void testSubtract() {
		calc.setNum1(4);
		calc.setNum2(1);
        int actual=calc.subtract();
        int expected=3;
        //assertEquals(expected,actual);
	}
}
