package arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		
//take an array
		int[]a= {10,20,30};
		int[]b= {40,50,60,70,80};
		
		//length of each array
		int a_leng=a.length;
		int b_leng=b.length;
		//create a new array length
		int c_leng=a_leng+b_leng;
		//create array c
		int[]c=new int[c_leng];
		//first for loop to put elements of a into c
		for(int i=0;i<a_leng;i++) {
			//put elements of a into c
			c[i]=a[i];
			
		}
		//second for loop
		for(int i=0;i<b_leng;i++) {
			//put elements of b into c
			c[a_leng+i]=b[i];//bcoz length of a is 3 so elements of b will start put in c at 3
			
		}
		//last loop to print the elements of c array
		for(int i=0;i<c_leng;i++)
		{
			//print elemens of c array
			System.out.print(c[i]+" ");
		}
	}

}
