 // C S C   1 5
 // Student's Name Here: Mohammad Taufique Imrose

 // Follow the directions on the Homework #4 handout and submit this file via Canvas by the due date.

package Main;

import java.util.Scanner;

public class Homework4{
	public static void main(String[] args){
		// TODO: Below do the requirements as listed in your assignment hand out.
		{
	        Scanner sc = new Scanner(System.in);
	 
	   String str = HWFoo();
	   
	  
	   easyprint(str);
	   
	   
	   System.out.print("Enter first value for addition: ");
	   int first= sc.nextInt();
	   System.out.print("Enter second value for addition: ");
	   int second= sc.nextInt();
	   int addition= add(first,second);
	   easyprint(addition);
	   
	  
	   sc.nextLine();
	   System.out.print("Enter input string for lowercase : ");
	   String inputStr = sc.nextLine();
	   easyprint(lowercase(inputStr));
	   
	   
	   System.out.print("Enter value to check isOdd:");
	   int val= sc.nextInt();
	   boolean result= isOdd(val);
	   easyprint(result);
	   
	   
	   sc.nextLine();
	   System.out.print("Enter string for easyprint: ");
	   String input =sc.nextLine();
	   easyprint(input);

	}
	}
	
	// Method Headers (below) for this assignment
	
	// String HWFoo();							// Returns the "Hello, World!" string
	// int add(int value1, int value2);			// Give two integers as parameters and returns the sum
	// String lowercase(String inputStr);		// Give a string in any case and returns it in lowercase
	// boolean isOdd(int number);				// Give an integer as parameter and returns whether number is odd (true) or even (false)
	// void easyprint(String input);			// Print the string given in "input" to the console
	
	// Methods I created for you (if you want to learn from them, feel free to take a look!)
	public static String HWFoo(){
		return "Hello, World!";
	}
	
	public static int add(int value1, int value2){
		return value1 + value2;
	}
	
	public static String lowercase(String inputStr){
		return inputStr.toLowerCase();
	}
	
	public static boolean isOdd(int number){
		int val = number & 0x01;
		if(val == 0)	return false;
		return true;
	}
	
	public static void easyprint(String input){
		System.out.println(input);
	}
	
	public static void easyprint(int input){
		System.out.println(Integer.toString(input));
	}
	
	public static void easyprint(boolean input){
		System.out.println(Boolean.toString(input));
	}
}