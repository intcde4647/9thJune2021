package com.cts.demo.model.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cts.demo.model.StringDemo2;

public class StringTest2 {

	StringDemo2 stringDemo;
	@Before
	public void setUp() throws Exception {
	stringDemo=new StringDemo2();
	}

	@After
	public void tearDown() throws Exception {
	  stringDemo=null;
	}

	@Test
	public void test1() {
		stringDemo.setStr1("hello");
		stringDemo.setStr2("hello");
		assertSame(stringDemo.getStr1(),stringDemo.getStr2());
		assertEquals(stringDemo.getStr1(),stringDemo.getStr2());
	}

	@Test
	public void test2() {
		String s1=new String("hello");
		String s2=new String("hello");
		stringDemo.setStr1(s1);
		stringDemo.setStr2(s2);
		// If we keep assertSame , the reference are different
		// and the testcase fails
		//assertSame(stringDemo.getStr1(),stringDemo.getStr2());
		assertEquals(stringDemo.getStr1(),stringDemo.getStr2());
	}
	
	
}
