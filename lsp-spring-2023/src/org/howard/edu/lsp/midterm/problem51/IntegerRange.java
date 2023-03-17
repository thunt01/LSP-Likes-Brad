package org.howard.edu.lsp.midterm.problem51;

public class IntegerRange implements Range {
	private int lower;
	private int upper;

// Hint: implement getters for lower and upper

	 IntegerRange(int lower, int upper) { 	// Constructor
    		this.lower = lower;
    		this.upper = upper;
	 }
	 public boolean contains(int value) {
		 if (lower <= value && upper >= value) {
			 return true;
		 }
		 return false;
	 }
	 public int getLower() {
		 return lower;
	 }
	 public int getUpper() {
		 return upper;
	 }
 
	 public boolean overlaps(Range other) throws EmptyRangeException {
		 
		 if (other == null) {
	            throw new EmptyRangeException("EmptyRangeException: The range is empty");
	        }
		 
		 if (lower <= other.getLower() && upper >= other.getLower()) {
			 return true;
		 }
		 if (other.getLower() <= lower && other.getUpper() >= lower) {
			 return true;
			 }
		 return false;
		 
	 }

	 public int size()  {
		 return upper - lower + 1;
	 }
}

