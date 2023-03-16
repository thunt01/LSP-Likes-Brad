package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is a data structure that represents a
 * set of integers
 * @author Brian Thaddeus Hunt (@02935184)
 *
 */
public class IntegerSet {

	private List<Integer> set = new ArrayList<Integer>();

	/**
	 * Default Constructor
	 */
	public IntegerSet() {}

	/**
	 * This method clears the internal representation of the set
	 */
	public void clear() {
		set.clear();
	}


	/**
	 * This method returns the length of the set
	 * @return length of set
	 */
	public int length() {
		return set.size();
	}

	/**
	 * This method checks if IntegerSet is equal to a second
	 * IntegerSet
	 * @param b IntegerSet being compared
	 * @return true if the two sets are equal, false otherwise;
	 */
	public boolean equals(IntegerSet b) {
		if (set.size() != b.set.size()) {
			return false;
		}
		for (int i=0;i <set.size();i++) {
			if (!b.contains(set.get(i))) {
				return false;
			}
		}
		return true;
	}	


	/**
	 * This method checks if set contains value
	 * @param value integer to check if is in set
	 * @return true if the set contains the value, otherwise false
	 */
	public boolean contains(int value) {
		return set.contains(value);
	};    

	/**
	 * This method returns the largest item in the set
	 * @return largest integer in set
	 * @throws IntegerSetException if set is empty
	 */
	public int largest() throws IntegerSetException {
		if (set.size() == 0) {
			throw new IntegerSetException("IntegerSetException: Largest element cannot be found becuase the IntegerSet is empty");
			}
		int large = set.get(0);

		for (int i=0;i <set.size();i++) {
			if (set.get(i) > large) {
				large = set.get(i);
			}
		}
		return large;
	} 

	/**
	 * This method returns the smallest item in the set
	 * @return smallest integer in set
	 * @throws IntegerSetException if set is empty
	 */
	public int smallest() throws IntegerSetException{
		
		if (set.size() == 0) {
		  throw new IntegerSetException("IntegerSetException: Smallest element cannot be found becuase the IntegerSet is empty");
		}
		int small = set.get(0);

		for (int i=0;i <set.size();i++) {
			if (set.get(i) < small) {
				small = set.get(i);
			}
		}
		return small;
	}

	
	/**
	 * This method adds an item to the set or 
	 * does nothing it already there
	 * @param item integer to be added
	 */
	public void add(int item) {
		if (!set.contains(item)) {
			set.add(item);
		}
	}

	/**
	 *  This method removes an item from the set or does nothing 
	 *  if not there
	 *  @param item integer to be removed from set
	 */
	public void remove(int item) {
		if (set.contains(item)) {
			set.remove(set.indexOf(item));
		}
	} 

	/**
	 * This method computes the union of the set and an
	 * input set
	 * @param intSetb second set in set union
	 */
	public void union(IntegerSet intSetb) {
		for (int i=0;i<set.size();i++) {
			intSetb.add(set.get(i));
		}
		set.clear();
		set.addAll(intSetb.set);
	}

	/**
	 * This method computes the intersect of the set 
	 * and an input set
	 * @param intSetb second set in set intersect
	 */
	public void intersect(IntegerSet intSetb) {
		for (int i=0;i<set.size();i++) {
			if (!intSetb.contains(set.get(i))) {	
				set.remove(set.indexOf(set.get(i)));
				i--;
			} 
			
		}
	} 


	/**
	 * This method computes the difference of the set and an
	 * input set
	 * @param intSetb second set in set difference
	 */
	public void diff(IntegerSet intSetb) {
		for (int i=0;i<set.size();i++) {
			if (intSetb.contains(set.get(i))) {
				set.remove(set.indexOf(set.get(i)));
				i--;
				
			}
		}

	}

	/**
	 * Checks if IntegerSet is empty
	 *  @return true if the set is empty, false otherwise
	 */
	boolean isEmpty() {
		return set.isEmpty();
	}

	/**
	 * Converts IntegerSet to String representation
	 *  @return String representation of your set
	 */
	public String toString() {
		return set.toString();
	}


}
