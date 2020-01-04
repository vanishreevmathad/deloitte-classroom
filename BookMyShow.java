package com.deloitte;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMyShow {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	int id = sc.nextInt();
	String name=sc.next();
	String showdate=sc.next();
	String showtime=sc.next();
	String status = sc.next();


		ArrayList<Object> al=new ArrayList<>();
		al.add(id);
		al.add(name);
		al.add(showdate);
		al.add(showtime);
		al.add(status);
		
		
		System.out.println("Enter id:");
		int id1=sc.nextInt();
		System.out.print(al);

}
}

