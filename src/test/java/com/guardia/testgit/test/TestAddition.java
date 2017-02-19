package com.guardia.testgit.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.guardia.testgit.operation.Addition;

public class TestAddition {

	private Addition myTestAddition = null;
	@Before
	public void initialize() {
		myTestAddition = new Addition();
	}
	@Test
	public void testAddition() {
		// TODO Auto-generated constructor stub
		Assert.assertEquals(myTestAddition.doAdd(4, 5), 9);
	}

}
