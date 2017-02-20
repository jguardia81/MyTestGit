/**
 * 
 */
package com.guardia.mytestgit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.guardia.testgit.operations.Power;

import junit.framework.Assert;

/**
 * @author jean
 *
 */
public class TestPower {

	private Power power = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		power = new Power();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.guardia.testgit.operations.Power#Power()}.
	 */
	@Test
	public void testPower() {
		Assert.assertTrue(power != null);
	}

	/**
	 * Test method for
	 * {@link com.guardia.testgit.operations.Power#doPower(int, int)}.
	 */
	@Test
	public void testDoPower() {
		Assert.assertEquals(power.doPower(3, 2), 9);
 	}

}
