package it.iftsrizzoli.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class EsempioSameObjectTest {

	@Test
	public void testGetString() {
		//fail("Not yet implemented");
		EsempioSameObject unitTest = new EsempioSameObject();
		assertSame(unitTest.getString("AAAA"), unitTest.getString("AAAA"));
		assertNotSame(unitTest.getString("BBBB"), unitTest.getString("AAAA"));
	}

}
