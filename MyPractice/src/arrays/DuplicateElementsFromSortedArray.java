package arrays;

public class DuplicateElementsFromSortedArray {

	public static void main(String[] args) {
	//'declare variable
		int arr[]= {1,2,2,3,4,4,5,6,6,7};
		int len = arr.length;
		// temperary array
		int temp[]=new int[arr.length];
		int j=0;//which counts the stack of the unique unit
		
		//traverse the original array
		for(int i=0;i<len-1;i++) {
			if(arr[i]!=arr[i+1]) {//if its not equal then its a unique element
				temp[j++] = arr[i];//1,
				//traversing array i is compare with 2 so i is not equal to 2 condition is false
				//and first iteration 
				//1 is at 0th position
				//next iteration-2 is compare with 2 so 2=2;condition is false
				//next iteration 2 is compare with 3 so 2 is not equal to 3
				//so after 1 in first position copied 2 in temp array 
				//like this continue.//1`,2,3,4,5,6
				//last element of array
				
				
				
				
				
		}

	}
		      temp[j++]=arr[len-1];//done traversing an array
		      //inner loop print unique element
		      for(int k=0;k<j;k++){//track unique element with j
		    	  System.out.print(temp[k]);
		      }

}
}
