package com.tecsup.lab10.junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ApplicationTest {

	@Test
	public void testSumar() {		
		Application app = new Application();		
		assertEquals(7 , app.sumar(4, 3));
	}
	
	@Test
	public void testRestar() {
		Application app = new Application();		
		assertEquals(1 , app.restar(4, 3));		
	}

	
}
