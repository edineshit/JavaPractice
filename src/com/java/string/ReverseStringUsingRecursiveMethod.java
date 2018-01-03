/**
 * 
 */
package com.java.string;

import java.util.Scanner;

/**
 * @author dineshkumar
 *
 */
public class ReverseStringUsingRecursiveMethod {

	/**
	 * @param args
	 */
	public static String reverse ="";
	public static void main(String[] args) {
		System.out.println("Please Enter the String for Reverse");
		Scanner input = new Scanner(System.in);
		
		String original = reverseString(input.nextLine()); 
		System.out.println("original----"+original);
	}
	
	private static String reverseString(String input){
		/*System.out.println("input---"+input);
		if(input.length()==1){
			return input;
		}else{
		reverse += (input.charAt(input.length()-1))+(reverseString(input.substring(0,input.length()-1))); 
		System.out.println("reverse----"+reverse);
		return reverse;
		}*/
		System.out.println("input---"+input);
		 if (input.isEmpty())
	            return input;
	        //Calling Function Recursively
		// System.out.println("loop----"+reverseString(input.substring(1)) + input.charAt(0));
	        return reverseString(input.substring(1)) + input.charAt(0);
	}

}
