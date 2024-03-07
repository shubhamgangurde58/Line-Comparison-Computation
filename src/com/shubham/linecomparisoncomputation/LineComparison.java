package com.shubham.linecomparisoncomputation;

import java.util.Scanner;

public class LineComparison {

			int x1;
			int y1;
			int x2;
			int y2;
		//	double length;
			
		public void lineInput() {
			
			System.out.println("Enter the value of X1,y1,x2 and y2 co-ordinate:");
			Scanner scanner = new Scanner(System.in);
			x1 = scanner.nextInt();
			y1 = scanner.nextInt();
			x2 = scanner.nextInt();
			y2 = scanner.nextInt();
		}
		
		public double linecalculate() {
			
			return  Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
			
		}
		
		public void linecheck(LineComparison linecomparison2) {
			if(this.linecalculate() ==  linecomparison2.linecalculate()) {
			
				System.out.println(" Both Lines are same");
			}else {
				System.out.println("Both line are not same");
			}
		}
		
	public static void main(String[] args) {
	
		System.out.println("Welcome To Line Camparison Computation Problem");
		LineComparison linecomparison = new LineComparison();
		LineComparison linecomparison2 = new LineComparison();

		linecomparison.lineInput();
		
		linecomparison2.lineInput();
		
		linecomparison.linecheck(linecomparison2);
	
	}

}
