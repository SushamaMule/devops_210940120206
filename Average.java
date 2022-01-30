

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter 5 numbers:");
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double d = scan.nextDouble();
		double e = scan.nextDouble();
		
		double avg = ((a + b + c + d + e ) / 5);
		
		System.out.println("Average of 5 numbers is :- " +avg);
		scan.close();
		

	}

}

