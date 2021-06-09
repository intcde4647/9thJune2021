package com.cts.demo.model.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cts.demo.model.StringDemo;

public class StringTest {

   StringDemo stringDemo;
	@Before
	public void setUp() throws Exception {
	  stringDemo=new StringDemo();
	}

	@After
	public void tearDown() throws Exception {
	   stringDemo=null;
	}

	@Test
	public void testGetStr() {
	        String s=stringDemo.getStr();
	        assertNull(s);
	}

	@Test
	public void testGetStr2() {
		    stringDemo.setStr("cts");
	        String s=stringDemo.getStr();
	        assertNotNull(s);
	}
}
