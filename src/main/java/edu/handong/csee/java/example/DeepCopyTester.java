package edu.handong.csee.java.example;
/**deep copy of a generic list
 * 09/11/2024
 */
import java.util.ArrayList;  // Import the ArrayList class
import java.util.Collections;// Import the collection class

public class DeepCopyTester {  //call class deepcopyTester 
	
	public static void main(String[] args) {  // Making a variable as static void main 
		DeepCopyTester tester = new DeepCopyTester();
		tester.run();  //tester runing 
	}

	public void run() {  //mehtord
		
		IntegerReader intReader = new IntegerReader();
		
		ArrayList<Integer> intNumbers = intReader.getIntegerNumbers();
		ArrayList<Integer> intNumbersCopiedShallowly = intNumbers;
		
		intReader.printOutIntegerNumbers(intNumbers);
		
		@SuppressWarnings("unchecked")  // method body
		ArrayList<Integer> intNumbersDeeplyCopied = (ArrayList<Integer>) intNumbers.clone();
		
		intNumbersCopiedShallowly.add(0);
		
		Collections.sort(intNumbersDeeplyCopied);  // Let us print the sorted list 
		
		intReader.printOutIntegerNumbers(intNumbers);//let pint out NUmber 
		
		System.out.println("Sorted ArrayList: ");    //original list printout
		intReader.printOutIntegerNumbers(intNumbersDeeplyCopied);
	}

}
