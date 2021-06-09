package com.cts.demo.model.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	 System.out.println("I am called once before all the testcases are called");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	System.out.println("I am called once after alll the testcases are called");
	
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("I am called before every testcases are called");
	}

	@After
	public void tearDown() throws Exception {
	System.out.println("I am called after every testcases are called");
	
	}

	@Test
	public void test1() {
		System.out.println("I am test1");
	}

	@Test
	public void test2() {
		System.out.println("I am test2");
	}
	
}
