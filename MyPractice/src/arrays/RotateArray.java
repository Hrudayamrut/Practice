package arrays;

public class RotateArray {


	public void reverse(int[] nums,int k)	{
		//reverse full array
		k=k%nums.length;//remainder  
		reverse(nums,0,nums.length-1);
		//reverse first 3 chara bcoz k=3times
		reverse(nums,0,k-1);
		//reverse last remaining char
		reverse(nums,k,nums.length-1);

	}
	
	//two pointers start or end
	public void reverse(int[] nums,int start,int end) {
		//while loop
		while (start < end) {
			int temp = nums[start];
			nums[end] = temp;
			start++;
			end--;
		}
	

}
	}
