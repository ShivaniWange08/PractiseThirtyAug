package Practise;

import java.util.Scanner;

public class ReverseInteger {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enetr a number");
	int n = sc.nextInt();
	int rev = 0;
	
	while(n != 0) {
		int dig = n%10;
		rev = rev * 10 + dig;
		n = n/10;
	}
	System.out.println("Reversed Number : " +rev);
	
	}
	}