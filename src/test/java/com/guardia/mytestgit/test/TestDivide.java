package com.guardia.mytestgit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.guardia.testgit.operations.Divide;

import junit.framework.Assert;

public class TestDivide {

	private Divide divide = null;
	@Before
	public void setUp() throws Exception {
		divide = new Divide();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDivide() {
		Assert.assertEquals(divide.divide(4, 2), 2);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDivideException(){
		divide.divide(12, 0);
	}

}
