/**
 * 
 */
package com.guardia.mytestgit.test;



import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.guardia.testgit.operations.Multiply;

/**
 * @author jean
 *
 */
public class TestMultiply {

	Multiply mul = null;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		mul = new Multiply();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMultiply() {
		Assert.assertEquals(mul.doMultiply(3, 6), 18);
	}

}
