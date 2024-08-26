package com.aditya.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {
	
//	We can create the instance at the class level like :
	ReverseString reverse = new ReverseString();
	
//	if we are doing this than we not need to make the instance in all the methods

	@Test
	void testReverseString_OneWord() {
//		ReverseString reverse = new ReverseString();
		assertEquals("avaJ", reverse.reverseString("Java"));
		
	}
	
	@Test
	void testReverseString_MultipleWords() {
//		ReverseString reverse = new ReverseString();
		assertEquals("ysaE si avaJ", reverse.reverseString("Java is Easy"));
	}

}
