package strings;



import java.util.Arrays;
import java.util.Scanner;

public class Annagram {

	public static void main(String[] args) {
		
//object of scanner
		Scanner sc = new Scanner(System.in);
		//Input the Strings
		//case sensitive
		//String x = "SILENT";
	    //String y = "LISTEN";
		//change above inputes in character arrays
	  //if string is not anagram to do this anagram
	    String x= "silent";
	    String y="LISTEN";
	   // x=x.replace("", "");
	    //y=y.replace("", "");
	    
	    x=x.toLowerCase();
	    x=x.toLowerCase();
		
		
		
		char a[]=x.toCharArray();
		char b[]=y.toCharArray();
		
		//sort the string x and y
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		//store the strings in result
		
		// and compare the strings anagram or not
		
		boolean result=Arrays.equals(a,b);
		//check
		if(result ==true)
		{
			System.out.println("String is Anagram");
		}
			else {
				System.out.println("String is not Anagram");
				
			}
		}
	
	}


	


