package com.junit.chap03;

import org.junit.Before;
import org.junit.Test;

public class TestDefaultController {

	private DefaultController controller;
	
	@Before
	public void instantiate() throws Exception {
		
		controller = new DefaultController();
		
	}
	
	
	@Test
	public void testMethod() {
		
		throw new RuntimeException("implement me");
		
	}
	
}
