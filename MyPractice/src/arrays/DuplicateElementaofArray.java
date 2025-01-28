package arrays;

public class DuplicateElementaofArray {

	public static void main(String[] args) {
		
		//initialize an array
		int arr[] = new int[] {3,5,3,5,4};
		System.out.println("Duplicate elements in given array");
		//loop
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				//compare i with j
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}

	}

}
}
