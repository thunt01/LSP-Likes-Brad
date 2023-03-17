package org.howard.edu.lsp.midterm.problem51;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.howard.edu.lsp.assignment5.IntegerSet;
import org.howard.edu.lsp.assignment5.IntegerSetException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerRangeTest {
	IntegerRange r;
	
	@BeforeEach
	public void setUp() {
		
		//sets up new IntegerRange before each test with
		//with ranfe from 5 - 10
		r = new IntegerRange(5,10);
	}
	
	@Test
	@DisplayName("Test case for contains method")
	public void testContains() {
		Assertions.assertFalse(r.contains(4));
		Assertions.assertTrue(r.contains(5));
		Assertions.assertTrue(r.contains(6));
	}
	
	@Test
	@DisplayName("Test case for overlaps method")
	public void testOverlaps() throws EmptyRangeException {
		IntegerRange r2 = new IntegerRange(1,4);
		IntegerRange r3 = new IntegerRange(1,5);
		IntegerRange r4 = new IntegerRange(1,6);
		IntegerRange r5 = new IntegerRange(1,40);
		IntegerRange r6 = new IntegerRange(8,40);
		
		IntegerRange r7 = null;
		
		Assertions.assertFalse(r.overlaps(r2));
		Assertions.assertTrue(r.overlaps(r3));
		Assertions.assertTrue(r.overlaps(r4));
		Assertions.assertTrue(r.overlaps(r5));
		Assertions.assertTrue(r.overlaps(r6));
		
		assertThrows(EmptyRangeException.class, () -> r.overlaps(r7));
		
	}
	
	@Test
	@DisplayName("Test case for size method")
	public void testSize() {
		Assertions.assertEquals(6, r.size());
	}
}
