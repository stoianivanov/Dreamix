package main;

import java.util.Scanner;

public class Factorialix {
	public static int factorial(int number){
		int result = 1;
		while(number != 0){
			result *= number --;
		}
		return result;
	}
	
	public static int sumOfFactorial(int number){
		int result = 0;
		while(number != 0){
			result += factorial(number % 10);
			number = number/10;
		}
		return result;
	}
	
	public static void printAllFactorialix(int rt){
		for (int i = 3; i <= rt; i++) {
			if(sumOfFactorial(i) == i){
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rt = sc.nextInt();
		printAllFactorialix(rt);
	}
}
