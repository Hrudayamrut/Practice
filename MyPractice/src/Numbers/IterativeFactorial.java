package Numbers;

import java.util.Scanner;

public class IterativeFactorial {

	public static void main(String[] args) {
		//take an int
		//if you want no. from user then use scanner class
		Scanner s = new Scanner(System.in);
		//import scanner
		//use method
		int no=s.nextInt();
		//int no=5;
		int fact=1;
		//declare variable
		//for loop
		for(int i=1;i<=no;i++)
		{
               fact=fact*i;
	}
		//out of for loop
		System .out.println(fact);

}
}
//value of i will start from 1
//fact=1*1=1 1<=5-true;
//increment value of i i.e.2
//fact=2*1=2 2<=5-true
//value of i became 3
//fact=3*1=3-true 3<=5 -true
//value of i became 4
//fact=4*1=4-true 4<=5 -true
//value of i became 5
//fact=5*1=5-true 5<=5 -true
//value of i became 6
//fact=6*1=6-true 6 is greater than 5-false
//terminate
