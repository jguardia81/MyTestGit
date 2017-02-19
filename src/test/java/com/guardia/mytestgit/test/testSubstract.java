package com.guardia.mytestgit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.guardia.testgit.operations.Substract;

import junit.framework.Assert;

public class testSubstract {

	private Substract testSub = null;
	@Before
	public void setUp() throws Exception {
		testSub = new Substract();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Assert.assertEquals(testSub.doSub(5, 2), 3);
	}

}
