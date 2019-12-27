package com.deloitte;
import java.util.Scanner;

public class Strings {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int []arr= {6,3,10,5,9};
		int n= arr.length;
		
		for (int i=0;i<n;i++) {
			for (int j=i+1;j<n;j++ ) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("After sorting ; ");
		for (int i:arr) {
			System.out.print(i+"\t");
		}

	}

}
