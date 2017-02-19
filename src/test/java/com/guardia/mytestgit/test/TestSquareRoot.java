/**
 * 
 */
package com.guardia.mytestgit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.guardia.testgit.operations.SquareRoot;

import junit.framework.Assert;

/**
 * @author jean
 *
 */
public class TestSquareRoot {
     private SquareRoot squareRoot = new SquareRoot();
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		squareRoot = new SquareRoot();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.guardia.mytestgit.test.SquareRoot#SquareRoot()}.
	 */
	@Test
	public void testSquareRoot() {
		Assert.assertTrue(squareRoot != null);
	}

	/**
	 * Test method for {@link com.guardia.mytestgit.test.SquareRoot#doSquareRoot(double)}.
	 */
	@Test
	public void testDoSquareRoot() {
		Assert.assertEquals(squareRoot.doSquareRoot(9), 3.0);
	}

}
