package arrays;

public class MaxValue {

	public static void main(String[] args) {
		
//make an array
		int a[] = new int [] {2,6,1,8,10,5,9,4};
		//make variables
		//guess 0 index is max and min
		int max = a[0];
		int min=a[0];
		//enhanced for loop can take values automically
		for(int x :a) //starts with 0
		{
		  if(x > max)	
			  //update max
		  {
			max = x;  
		  }
		  if(min> x)	
			  //update min
		  {
			min = x;  
		  }
		  }
		
	//result
	System.out.println("Max value = " + max + "min value = " + min);
		
	
}
}


