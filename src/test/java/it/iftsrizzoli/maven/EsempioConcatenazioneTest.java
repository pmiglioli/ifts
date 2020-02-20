package it.iftsrizzoli.maven;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class EsempioConcatenazioneTest {
	@Test
	public void testConcatenate() {
		
		EsempioConcatenazione unitTest = new EsempioConcatenazione();

		String result = unitTest.concatenate("one", "two");

		assertEquals("onetwo", result);

	}
	@Test
	public void testGetStringa() {
		EsempioConcatenazione unitTest = new EsempioConcatenazione();
		
		String stringa =unitTest.getString("AAAA");
		
		assertSame("AAAA", stringa);
		
		assertNotSame("BBBB", stringa);
	}
}
