package com.sapient.trg.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class HelloWorldTestTest {
	
	private HelloWorld helloWorld = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeAll executes before all the methods only once.");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("@BeforeAll executes after all the methods only once.");
	}

	@BeforeEach
	void setUp() throws Exception {
		helloWorld = new HelloWorld("Hello World");
	}

	@AfterEach
	void tearDown() throws Exception {
		helloWorld = null;
	}
	@Disabled
	@Test
	void testAllArgConstructor() {
		HelloWorld helloWorld = new HelloWorld(null);
		assertThrows(IllegalArgumentException.class, () -> helloWorld.getMessage());
	}
	
	@Test
	void testForValidGetPersonId() {
		assertEquals("Hello World",helloWorld.getMessage());
	}
}
