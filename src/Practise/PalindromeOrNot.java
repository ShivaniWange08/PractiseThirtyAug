package Practise;

import java.util.Scanner;

public class PalindromeOrNot {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		
		String rev = "";
		
		for(int i = s.length()-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}
		
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("It is Palindrome");
		}
		else {
			System.out.println("It is not Palindrome");
		}
		
	}

}
