package com.example;
import java.util.Scanner;


public class Fibonacci{
	
	 public static int fibonacci(int n) {
			if(n == 0) return 0;
			if(n == 1) return 1;
			return fibonacci(n-1) + fibonacci(n-2);
		}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter No. of Terms: ");
		int n = input.nextInt();
		int[] nums = new int[n+1];
		
	    for(int i=0; i<=n; i++) {
	    	
	    	int number = fibonacci(i);
	    	nums[i] = number;
	    	
	    }
	    for(int i=0; i<=n; i++) {
	    	System.out.print(nums[i]+" ");
	    }
	   
	}
}