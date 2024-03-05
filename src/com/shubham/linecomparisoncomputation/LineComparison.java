package com.shubham.linecomparisoncomputation;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		
		System.out.println("Welcome To Line Camparison Computation Problem");
		int x1;
		int y1;
		int x2;
		int y2;
		double length;
	
			Scanner scanner = new Scanner(System.in);
			x1 = scanner.nextInt();
			y1 = scanner.nextInt();
			x2 = scanner.nextInt();
			y2 = scanner.nextInt();
			
			length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
			System.out.println("Length of Line="+length);
			
	}

}
