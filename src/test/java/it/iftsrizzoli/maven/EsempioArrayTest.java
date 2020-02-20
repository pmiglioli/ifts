package it.iftsrizzoli.maven;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class EsempioArrayTest {

	@Test(expected = java.io.IOException.class)
	public void testGetArray() {
		String[] expectedArray = { "one", "two", "three" };
		// fail("Not yet implemented");
		EsempioArray secondoTest = new EsempioArray();
		assertArrayEquals(expectedArray, secondoTest.getArray());
	}

}
