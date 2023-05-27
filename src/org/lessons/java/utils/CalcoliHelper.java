package org.lessons.java.utils;

public class CalcoliHelper {
	
	private CalcoliHelper() {}
	
	public static int sum(int x, int y) {
		
		return x + y;
	}
	
	public static double sum(double x, double y) {
		
		return x + y;
	}
	
	public static int diff(int x, int y) {
		
		return x - y;
	}
	
	public static double diff(double x, double y) {
		
		return x - y;
	}
	
	public static int mol(int x, int y) {
		
		return x * y;
	}
	
	public static double mol(double x, double y) {
		
		return x * y;
	}
	
	public static int abs(int x) {
		
		return x < 0 ? (x * -1) : x;
	}
	
	public static double abs(double x) {
		
		return x < 0 ? (x * -1) : x;
	}
	
	public static int min(int x, int y) {
		
		return x < y ? x : y;		
	}
	
	public static double min(double x, double y) {
		
		return x < y ? x : y;
	}
	
	public static int max(int x, int y) {
		
		return x < y ? y : x;
	}
	
	public static double max(double x, double y) {
		
		return x < y ? y : x;
	}
	
	public static int esp (int x, int y) {
		
		int ris = 1;
		
		if (x < 0 && y < 0) {
			
			return ris;
		}
		else {
			
			for (int i = 0; i < y; i++) {
				
				ris *= x;
			}
		}
		
		return ris;
	}
}
