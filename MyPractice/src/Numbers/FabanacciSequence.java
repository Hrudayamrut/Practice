package Numbers;

public class FabanacciSequence {

	public static void main(String[] args) {
		
//take 2 numbers fix
		int a=0,b=1;
		//print these two nos.
		System.out.print(a+""+b);
		//for loops for how much nos we are printing
		
		
		//take a variable
		int c;
		for(int i=1;i<=10;i++)
		{
			 c=a+b;
			 System.out.print(" " +c);
			 //no swapping
			 a=b;
			 b=c;
	}

}
}
