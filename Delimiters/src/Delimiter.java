
/**
 * @author  OfficeSystem2
 * Author: PriestofTuna
 * Email: lyttekk@yahoo.com
 * Date: 11/2/15
 * 
 * Description:
 * A program that uses use input through Console Scanner to find ten int variables
 *  After they are found the program will add them together and give the user the average.
 *  
 *  Optional:
 *  This program can also be used for varying amounts of numbers if modified, simply use loop and add in the appropriate variables.
 *  Then set the loop to increment every time the user inputs a new number. When this is finished modify the final print out to read
 *  System.out.print("\n" + iT/10 + intcounter);
 *  
 */

import java.util.Scanner;
//imports Scanner

public class Delimiter {
	// creates the class "Delimiter"
	private static Scanner keyboard = new Scanner(System.in);

	// creates a constant that can be used across multiple variables to improve
	// efficiency
	public static void main(String[] args) {
		// Defines the main and the use of args
		int i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, iT;
		// i stands for int, thus i1 stands for int1 etc.
		keyboard.useDelimiter(",");
		// sets delimiter for ",", used so that the user doesn't have to use tab
		System.out.print("\n" + "Enter 10 numbers" + "\n" + "\t" + "(Delimited by" + "\"" + "," + "\"" + ")" + "\n");
		// prompts user to enter ints

		// or enter for i1-i10
		i1 = keyboard.nextInt();
		// initializes i1 and links it to the next use of the private Scanner
		// "keyboard"
		i2 = keyboard.nextInt();
		// initializes i2 and links it to the next use of the private Scanner
		// "keyboard"
		i3 = keyboard.nextInt();
		// initializes i3 and links it to the next use of the private Scanner
		// "keyboard"
		i4 = keyboard.nextInt();
		// initializes i4 and links it to the next use of the private Scanner
		// "keyboard"
		i5 = keyboard.nextInt();
		// initializes i5 and links it to the next use of the private Scanner
		// "keyboard"
		i6 = keyboard.nextInt();
		// initializes i6 and links it to the next use of the private Scanner
		// "keyboard"
		i7 = keyboard.nextInt();
		// initializes i7 and links it to the next use of the private Scanner
		// "keyboard"
		i8 = keyboard.nextInt();
		// initializes i8 and links it to the next use of the private Scanner
		// "keyboard"
		i9 = keyboard.nextInt();
		// initializes i9 and links it to the next use of the private Scanner
		// "keyboard"
		i10 = keyboard.nextInt();
		// initializes i10 and links it to the next use of the private Scanner
		// "keyboard"
		iT = i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10;
		// gives int variable "iT" the value of i1-i10 added together, used for
		// efficiency to reduce lines of code for longer projects

		System.out.print("\n" + iT / 10 + " is the average of these numbers.");
		// prints out iT divided by the number of numbers, if this was a
		// changing amount of i's a loop would be used to count the number
		// of i's
	}

}
