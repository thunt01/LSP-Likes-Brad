package org.howard.edu.lsp.assignment4;

public class Driver {

	public static void main(String[] args) throws IntegerSetException {
		// TODO Auto-generated method stub
		
		IntegerSet set1 = new IntegerSet();
		set1.add(2);
		set1.add(3);
		set1.add(1);
		set1.add(6);
		set1.add(4);
		set1.add(7);


		
		System.out.println("Value of Set1 is: " + set1.toString());
		set1.add(5);
		System.out.println("Value of Set1 after adding 5 is: " + set1.toString());
		set1.add(5);
		System.out.println("Value of Set1 after adding 5 again: " + set1.toString());
		set1.remove(7);
		System.out.println("Value of Set1 after removing 7 is: " + set1.toString());
		set1.remove(7);
		System.out.println("Value of Set1 after removing 7 again: " + set1.toString());	
		System.out.println();
		
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Set1 contains 5: " + set1.contains(5));
		System.out.println("Set1 contains 7: " + set1.contains(7));
		System.out.println();
		
		System.out.println("The length of Set1 is: " + set1.length());
		System.out.println("Smallest value in Set1 is: " + set1.smallest());
		System.out.println("Largest value in Set1 is: " + set1.largest());
		
		System.out.println("Set1 is empty: " + set1.isEmpty());
		set1.clear();
		System.out.println("Set1 is empty (after clearing): " + set1.isEmpty());
		
		System.out.println();
		

		IntegerSet set2 = new IntegerSet();
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		set2.add(9);
		
		set1.add(8);
		set1.add(9);
		set1.add(6);

		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		System.out.println("Set1 equals Set2: " + set1.equals(set2));
		System.out.println();

		set1.add(5);
		set1.add(7);

		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		System.out.println("Set1 equals Set2: " + set1.equals(set2));
		System.out.println();
		
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		set2.add(9);
		
		set1.clear();

		System.out.println("Union of Set1 and Set2");
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		set1.union(set2);	// union of set1 and set2
		System.out.println("Result of union of Set1 and Set2: " + set1.toString());
		System.out.println();
		
		set1.clear();
		set1.add(2);
		set1.add(6);
		set1.add(8);
		set2.remove(6);
		set2.remove(8);
	
		System.out.println("Union of Set1 and Set2");
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		set1.union(set2);	// union of set1 and set2
		System.out.println("Result of union of Set1 and Set2: " + set1.toString());
		System.out.println();
		
		set2.remove(6);
		set2.remove(8);
		set2.add(18);
		set1.remove(5);
		
		System.out.println("Intersect of Set1 and Set2");
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		set1.intersect(set2);	// union of set1 and set2
		System.out.println("Result of intersect of Set1 and Set2: " + set1.toString());
		System.out.println();
		
		set2.clear();
		
		System.out.println("Intersect of Set1 and Set2");
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		set1.intersect(set2);	// union of set1 and set2
		System.out.println("Result of intersect of Set1 and Set2: " + set1.toString());
		System.out.println();
		
		set2.add(6);
		set2.add(7);
		set2.add(8);
		
		System.out.println("Difference of Set1 and Set2");
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		set1.diff(set2);	// union of set1 and set2
		System.out.println("Result of difference of Set1 and Set2: " + set1.toString());
		System.out.println();
		
		set1.add(8);
		set1.add(88);
		set1.add(1);
		set1.add(4);
		set1.add(6);
		set2.add(22);
		
		System.out.println("Difference of Set1 and Set2");
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		set1.diff(set2);	// union of set1 and set2
		System.out.println("Result of difference of Set1 and Set2: " + set1.toString());
		System.out.println();
	}

}
