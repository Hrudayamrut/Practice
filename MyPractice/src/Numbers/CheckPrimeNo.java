package Numbers;

import java.util.Scanner;

public class CheckPrimeNo {

	public static void main(String[] args) {
		//take a no.
		//scanner class object for user value
		Scanner s=new Scanner(System.in);
		//import scanner class
		//int no=7;
		System.out.println("Enter the no.");
		int no = s.nextInt();
//check the no.
		//for loop
		int temp=0;//
		
		for(int i=2;i<=no-1;i++)
		{
			if(no%i==0)
			{
				    temp=temp+1;
	}

}
		if(temp==0)
		{ 
			System.out.println(no+"is prime no");
}
		else
		{
			System.out.println(no+"is not prime");
}
}
}
