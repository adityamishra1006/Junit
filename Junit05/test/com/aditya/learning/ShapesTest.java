package com.aditya.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {

	@Test
	void testComputeSquareArea() {
		Shapes shape = new Shapes();
		
		assertEquals(576, shape.computerSquareArea(24));
		
	}
	
	@Test
	void testComputeCircleArea() {
		Shapes shape = new Shapes();
		
		assertEquals(78.5, shape.computerCircleArea(5));
	}
	
	@Test
	void testComputeCircleArea_Supplier() {
		Shapes shape = new Shapes();
		
		assertEquals(76.5, shape.computerCircleArea(5), ()->"Area of circle is computed wrong.");
	}

}
