package com.deloitte;
import java.util.Scanner;

public class ControlStructures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner in =new Scanner(System.in);
				System.out.println("Enter 3 nos");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		 if(a>b) {
			 if(a>c) {
				 System.out.println("A -"+a);
			 }
			 else {
				 System.out.println("C -"+c);
				 
			 }
			 
		 }
		 else if(b>c) {
			 System.out.println("B-"+b);
		 }
		 else {
			 System.out.println("c-"+c);
		 }
	}

}
