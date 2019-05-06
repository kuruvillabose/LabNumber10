package co.grandcircus;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String prompt = "Y";
		while (prompt.equalsIgnoreCase("Y")) {
		System.out.println("Welcome to the Circle Tester");
		
		System.out.println("Enter radius:");
		double radius=scan.nextDouble();
		Circle circ=new Circle(radius);
		System.out.println("Circumference :"+circ.getFormattedCircumference());
		System.out.println("Area:"+circ.getFormattedArea());
		System.out.println("Continue?(y/n)");
		prompt=scan.next();
		
		}
		scan.close();
		System.out.println("Goodbye");

	}

}
