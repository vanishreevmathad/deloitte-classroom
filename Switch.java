package com.deloitte;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a,b,c;
		Scanner in = new Scanner (System.in);
		System.out.println("enter 3  nos");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		int largest = (c> (a>b? a:b)) ? c: (a>b? a:b);
		System.out.println("Largest =" +largest);
		                                                                                       
	}

}
