package com.aditya.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapesTest {
	
	Shapes shape = new Shapes();

	@Test
	void testComputeSquareArea() {
		assertNotEquals(574, shape.computerSquareArea(24));
	}
	
	@Test
	void testComputeSquareArea_WithMessage() {
		assertNotEquals(576, shape.computerSquareArea(24), "Message to dev if testcase fails.");
	}
	
	
	@Test
	void testComputeSquareArea_Supplier() {
		assertNotEquals(576, shape.computerSquareArea(24), ()-> "Message to dev if testcase fails.");
	}
	
//	Other assertion methods
	
	@Test
	void test() {
		String str = "Junit";
		assertTrue(str.equals("Junit"));
	}
	
	@Test
	void testII() {
		String str = "Junit";
		assertFalse(str.equals("Junit"));
	}
	
	@Test
	void testArray() {
		int[] exp = {2, 4, 6, 8};
		
		int[] act = {4, 8, 6, 2};
		
		Arrays.sort(act);

		assertArrayEquals(exp, act);
	}
	
	//Go through some annotations like
	@BeforeEach
	void init() {
		// Comes before every methods
	}
	
	@AfterEach
	void initII() {
		// Comes after every methods
	}
	
	@BeforeAll
	static void initIII(){
		// This annotation is used for static methods only.
		// Static methods are independent of instances.
		// Executed only once before executing all test case.
	}
	
	@AfterAll
	static void afterAll() {
		// Executed only once after executing all test case.
	}

}


