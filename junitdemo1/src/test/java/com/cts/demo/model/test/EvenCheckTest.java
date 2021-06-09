package com.cts.demo.model.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cts.demo.model.EvenCheck;

public class EvenCheckTest {
      private EvenCheck evenCheck;
	@Before
	public void setUp() throws Exception {
      evenCheck=new EvenCheck();
	}

	@After
	public void tearDown() throws Exception {
	 evenCheck=null;
	}

	@Test
	public void testIsEven() {
	  evenCheck.setNum(5);
	  boolean isEven=evenCheck.isEven();
	  //assertTrue(isEven);
	  assertTrue("Not even", isEven);
	  //assertFalse(isEven);
	}

}
