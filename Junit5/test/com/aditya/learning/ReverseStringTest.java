package com.aditya.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString reverse = new ReverseString();
		assertEquals("avaJ", reverse.reverseString("Java"));
		assertEquals("neilA", reverse.reverseString("Alien"));
 	}

}

//What is @Test annotation in JUnit 5? 
//We are using this annotation to mark method as test.
//Visibility of @Test annotated method can be public, protected default.
//Also informs test engine what methods needs to run.


// What is assertion? Verification between expected outupt and actual output


// Junit 