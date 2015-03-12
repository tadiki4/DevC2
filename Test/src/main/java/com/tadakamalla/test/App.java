package com.tadakamalla.test;

public class App {

	public static void main(String[] args){
		
		System.out.println ("Hello world");
		//Iterative style for fibonacci
		Fibonacci(10);
		
		//Recursive style for fibonacci.
		for (int i = 1; i<=5; i++){
			FibonacciRecursive(i);
					}
	}
	
	public static void Fibonacci (int number) {
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		System.out.println ("Fibonacci Series");
		//Iterative
		for(int index = 0; index<=number; index++){
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			
			System.out.println(sum);
		}
	}
	
	public static int FibonacciRecursive(int number){
		if (number==1 || number ==2){
			return 1;
		}
		return FibonacciRecursive (number-1)+FibonacciRecursive(number-2);
						
	}
	
}
