package com.deloitte;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {1,2,10,8,6};
		int max = nums[0];
		int min = nums[0];
		
		for (int i:nums) {
			if(i>max) {
				max=i;
			}
			if (i<min) {
				min = i;
			}
		}
		System.out.println("Largest is "+max);
		System.out.println("Smallest is "+min);
		}

}
