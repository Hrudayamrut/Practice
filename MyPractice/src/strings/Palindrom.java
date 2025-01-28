package strings;



import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
//declare string
		String s = new String();
		//import scanner class
		// scanner object for give input in console
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to Check");
		// read the String
		s=sc.nextLine();
		
		int i,j,flag=0;
		// index of i
		i=0;//first index
		j=s.length()-1;//last index
		flag=0;//0 is for palingdrom and f=1 not palindrom
		
		while(i<j && flag==0)//loop will repeat until i<j 
			//if is not less than j then loop will terminate and 
			//flag will replace from 0 to 1
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				flag=1;
				break;
			}
				i=i+1;
				j=j-1;
		}
				if(flag==0) 
					System.out.println("Palindrom");
				
				else 
					
					System.out.println(" Not Palindrom");
					
				}
			}
		

	




