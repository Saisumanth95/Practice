package com.gap;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

class MathUtilsTest {
	
	
	MathUtils mathutils;
	TestInfo testinfo;
	TestReporter testReporter;
	
	
	
	@BeforeEach
	void init(TestInfo testinfo, TestReporter testReporter) {
		mathutils = new MathUtils();
		this.testinfo = testinfo;
		this.testReporter = testReporter;
		testReporter.publishEntry("Running " + testinfo.getDisplayName() + " with tags " + testinfo.getTags());
	}
	
	

	@Test
	@DisplayName("This is addTest Method")
	void testAdd() {

		int expected = 2;
		int actual = mathutils.add(1, 1);
		assertEquals(expected,actual, "Add two numbers");
		
	}
	
	
	@Test
	void testDivide() {
		
		assertThrows(ArithmeticException.class,() -> mathutils.divide(2,0), "Divide by Zero");
		
	}
	
	
	@RepeatedTest(3)
	void testComputeCircleArea(RepetitionInfo repetitionInfo) {
		
		
		assertEquals(314.1592653589793, mathutils.computeCircleArea(10), 
				"Should return right circle area");
		
	}
	
	
	@Test
	@Tag("Math")
	@DisplayName("Assert All Method")
	void multiple() {
		
		testReporter.publishEntry("Running " + testinfo.getDisplayName() + " with tags " + testinfo.getTags());
		
		assertAll(
				() -> assertEquals(2,mathutils.add(1, 1)),
				() -> assertEquals(4,mathutils.add(2, 2)),
				() -> assertEquals(5,mathutils.add(3, 2))
				);
		
	}
	
	
	@Nested
	class NestedTest{
		
		@Test
		void ns1() {
			assertEquals(2,mathutils.add(1, 1));
		}
		
		
		@Test
		void ns2() {
			assertEquals(-2,mathutils.add(-1, -1));
		}
		
	}
	
	
	
	
	@Test
	@Disabled
	@DisplayName("Failing Method")
	void testDisabled() {
		fail("This is to fail test");
	}
	
	
	
	

}
