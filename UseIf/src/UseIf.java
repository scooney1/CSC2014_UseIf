/**
 * Author:	Sam Cooney
 * Project:	UseIf
 * Date:	Oct 4, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: Driver class.
 */

import java.util.Scanner;		// Allows use of Scanner class.
import java.text.DecimalFormat;	// Allows use of DecimalFormat class.

public class UseIf {

	public static void main(String[] args) {
		Box myBox = new Box(85);						// Instantiate obj for class Box.
		Calc myCalc = new Calc();						// Instantiate obj for class Calc.
		Scanner scan = new Scanner(System.in);			// Instantiate obj for class Scanner.
		DecimalFormat fmt = new DecimalFormat("0.00");	// Instantiate obj for class DecimalFormat.
		
		System.out.println("Enter a student's name.");
		String sname = scan.nextLine();		// Read in string.
		System.out.println("Enter the student's grade as xx.xx.");
		double sgrade = scan.nextDouble();	// Read in double.
		System.out.println("Student Name: " + sname + "\nStudent Grade: " + fmt.format(sgrade));
		if(sgrade < 80) {	// If statement for grade less than 80.
			
			System.out.println("Student " + sname + " does not belong in the group being processed.");
			System.out.println(myBox);	// Call toString for Box.
			
			scan.close();	// Close scan.
			return;
		}
		
		String prtgrade = myCalc.Calculate(sgrade);	// Call method Calculate in class Calc.
		LetterB myLetter = new LetterB(sname,prtgrade,sgrade);	// Instantiate obj for class LetterB.
		System.out.println(myLetter);	// Call toString for LetterB.
		System.out.println(myBox);		// Call toString for Box.
		
		scan.close();	// Close scan.
	}	// End main.

}	// End class.
