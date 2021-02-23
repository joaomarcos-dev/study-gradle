package com.package01;

import static org.junit.Assert.assertEquals;

@TestClass
public SquareTest{
	
	@Test
	public void squareTest(){
		double value = 5;
		assertArrayEquals("failure - not correctly squared", Square.squared(value), Math.sqrt(value));
	}
	
}