package org.lessons.java.utils;

public class Main {
	
	public static void main(String[] args) {
		
		int x = 2, y = 4;
		double a = 30, b = 20;
		
		int resInt = CalcoliHelper.sum(x, y);
		System.out.println("Sum: " + resInt);
		
		double resDouble = CalcoliHelper.sum(a, b);
		System.out.println("Sum: " + resDouble);
		
		resInt = CalcoliHelper.diff(x, y);
		System.out.println("Diff: " + resInt);
		
		resDouble = CalcoliHelper.diff(a, b);
		System.out.println("Diff: " + resDouble);
		
		resInt = CalcoliHelper.mol(x, y);
		System.out.println("Moll: " + resInt);
		
		resDouble = CalcoliHelper.mol(a, b);
		System.out.println("Moll: " + resDouble);
		
		resInt = CalcoliHelper.abs(x);
		System.out.println("Abs: " + resInt);
		
		resDouble = CalcoliHelper.abs(a);
		System.out.println("Abs: " + resDouble);
		
		resInt = CalcoliHelper.min(x, y);
		System.out.println("Min: " + resInt);
		
		resDouble = CalcoliHelper.min(a, b);
		System.out.println("Min: " + resDouble);
		
		resInt = CalcoliHelper.max(x, y);
		System.out.println("Max: " + resInt);
		
		resDouble = CalcoliHelper.max(a, b);
		System.out.println("Max: " + resDouble);
		
		resInt = CalcoliHelper.esp(x, y);
		System.out.println("Esp: " + resInt);
	}
}
