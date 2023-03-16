package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * This class contains the JUnit test cases for the
 * IntegerSet class
 * @author Brian Thaddeus Hunt (@02935184)
 *
 */

public class IntegerSetTest {
	IntegerSet set;
	
	@BeforeEach
	public void setUp() {
		//sets up new IntegerSet before each test
		set = new IntegerSet();
	}
	
	@Test
	@DisplayName("Test case for clear method")
	public void testClear() {
		set.add(1);
		set.add(2);
		set.add(3);
		set.clear();
		Assertions.assertTrue(set.isEmpty());
		
		//checks result of clearing empty
		set.clear();
		Assertions.assertTrue(set.isEmpty());
	}

	@Test
	@DisplayName("Test case for length method")
	public void testLength() {
		Assertions.assertEquals(0, set.length());
		set.add(1);
		set.add(2);
		set.add(3);
		Assertions.assertEquals(3, set.length());
	} 
	
	@Test
	@DisplayName("Test case for equals method")
	public void testEquals() {
		IntegerSet set2 = new IntegerSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set2.add(2);
		set2.add(3);
		//Do not contain all the same elements
		Assertions.assertFalse(set.equals(set2));
		
		set2.add(1);
		//Contains all elements in different order
		Assertions.assertTrue(set.equals(set2));
	} 

	@Test
	@DisplayName("Test case for contains method")
	public void testContains() {
		//test empty set
		Assertions.assertFalse(set.contains(1));
		//test set containing item
		set.add(1);
		Assertions.assertTrue(set.contains(1));
		//test set after removing item
		set.remove(1);
		Assertions.assertFalse(set.contains(1));
	}    

	@Test
	@DisplayName("Test case for largest method")
	public void testLargest() throws IntegerSetException {
		//test exception when set is empty
		assertThrows(IntegerSetException.class, () -> set.largest());
		
		set.add(1);
		set.add(3);
		set.add(2);
		Assertions.assertEquals(3, set.largest());
	} 

	@Test
	@DisplayName("Test case for smallest method")
	public void testSmallest() throws IntegerSetException {
		//test exception when set is empty
		assertThrows(IntegerSetException.class, () -> set.smallest());
		
		set.add(3);
		set.add(1);
		set.add(2);
		Assertions.assertEquals(1, set.smallest());
	}

	@Test
	@DisplayName("Test case for add method")
	public void testAdd() {
		set.add(1);
		set.add(1); //test duplicate add
		set.add(2);
		Assertions.assertTrue(set.contains(1));
		Assertions.assertTrue(set.contains(2));
		Assertions.assertEquals(2, set.length());
	} 
	
	@Test
	@DisplayName("Test case for remove method")
	public void TestRemove() {
		set.add(1);
		set.add(2);
		set.add(3);
		set.remove(4); //test removing item not in set
		Assertions.assertEquals(3, set.length());
		set.remove(2); //test removing item in set
		Assertions.assertFalse(set.contains(2));
		Assertions.assertEquals(2, set.length());
	} 

	@Test
	@DisplayName("Test case for union method")
	public void testUnion() {
		IntegerSet set2 = new IntegerSet();
		set.union(set2);
		Assertions.assertTrue(set.isEmpty());  //union of empty sets
		
		set.add(1);
		set.add(2);
		set2.add(3);
		set2.add(4);
		set.union(set2);
		Assertions.assertTrue(set.contains(1));
		Assertions.assertTrue(set.contains(2));
		Assertions.assertTrue(set.contains(3));
		Assertions.assertTrue(set.contains(4));
		Assertions.assertEquals(4, set.length());
		
	}

	@Test
	@DisplayName("Test case for intersect method")
	public void testIntersect() {
		IntegerSet set2 = new IntegerSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set.intersect(set2);
		//test intersect of non intersecting sets
		Assertions.assertTrue(set.isEmpty());
		
		
		set.add(5);
		set.add(9);
		set.intersect(set2);
		Assertions.assertTrue(set.contains(5));
		Assertions.assertFalse(set.contains(9));
		Assertions.assertEquals(1, set.length());
	} 

	@Test
	@DisplayName("Test case for difference method")
	public void testDiff() {
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set.diff(set2);
		//difference when set is empty
		Assertions.assertTrue(set.isEmpty());
		
		set.add(3);
		set.diff(set2);
		//difference when set and input set are disjoint
		Assertions.assertTrue(set.contains(3));
		Assertions.assertEquals(1, set.length());
		
		set.add(0);
		set.add(1);
		set.add(2);
		set.diff(set2);
		//difference when set and input set are not disjoint
		Assertions.assertTrue(set.contains(3));
		Assertions.assertTrue(set.contains(0));
		Assertions.assertEquals(2, set.length());
	} 

	@Test
	@DisplayName("Test case for isEmpty method")
	public void testIsEmpty() {
		Assertions.assertTrue(set.isEmpty());
		
		set.add(1);
		set.add(2);
		set.add(3);
		Assertions.assertFalse(set.isEmpty());

		//test if set is empty after clearing
		set.clear();
		Assertions.assertTrue(set.isEmpty());
	} 

	@Test
	@DisplayName("Test case for toString method")
	public void testToString() {
		Assertions.assertEquals("[]", set.toString());
		set.add(1);
		set.add(2);
		set.add(3);
        Assertions.assertEquals("[1, 2, 3]", set.toString());
        
        set.add(3);
        Assertions.assertEquals("[1, 2, 3]", set.toString());
	}	

}
