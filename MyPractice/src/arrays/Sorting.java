package arrays;

public class Sorting {
	private static final int i = 0;
	//make function for print
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++){
		
		System.out.print(arr[i]+" ");
	}
            System.out.println();
            }



	public static void main(String[] args) {
		//make an array
		int arr[] = {7,8,3,1,2};
		//bubble sort
		//n-1 elements arrange
		for(int i=0;i<arr.length-1;i++) {
			//inner loop sort
			for(int j=0;j<arr.length-i-1;j++) { //-i becoz 1 element is already sorted 
          //check condition
			if(arr[j] >arr[j+1])	{
				//swap-change values i.e-1->2,2->1
				//make temperary variable to store value of i
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1]=temp;
	}

}
}
		//call main function into print array function
		printArray(arr);
}

}

