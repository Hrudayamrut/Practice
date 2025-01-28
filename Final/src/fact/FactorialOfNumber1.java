package fact;

import java.util.Scanner;

public class FactorialOfNumber1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int no= s. nextInt();
		
		int fact=1;
		for(int i=no;i>=1;i--)//only this difference in recursive
		{
	        fact=fact*i;
		}
		System.out.println(fact);

	}
	}
