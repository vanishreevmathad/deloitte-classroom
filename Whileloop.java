package com.deloitte;
import java.util.Scanner;


public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		    Scanner in =new Scanner(System.in);
				int n;
				 System.out.println("Enter a number : ");
				 n=in.nextInt();
				 
				 for(int i=1; i<=n; i++) {
					 for (int j=1; j<=i; j++) {
						 System.out.print((i+j-1)%2);
					 }
					 System.out.println();
				 }
		}

}
