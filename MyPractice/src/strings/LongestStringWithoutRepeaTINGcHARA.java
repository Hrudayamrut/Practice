package strings;



import java.util.ArrayList;
import java.util.List;

public class LongestStringWithoutRepeaTINGcHARA {

	public static void main(String[] args) {
		//take a string
		String s = "bbbbbbb";
		//take two variables
		int start=0;
		int end = 0;
	//initiasise one more variable to store the max length
		int max_length=0;
		//take list to store characters
		List<Character> list=new ArrayList<Character>();
		//import the list
		
		//put at checking condition
		while(end<s.length())
		{
			//check the condition
			
			if(!list.contains(s.charAt(end)))
			{
		
		//add that character
				list.add(s.charAt(end));
				//keep updating the end index
				end++;
				//need to update max length 
				max_length=Math.max(max_length,list.size());
			}
				//if t56his condition is false which means we have already have that char 
				//so we need to remove that char
				else
				{
					list.remove(Character.valueOf(s.charAt(start)));
					//update the start index
					start++;			}
		
		
		
		

	}
		System.out.println("max length is"+max_length);

}
}

