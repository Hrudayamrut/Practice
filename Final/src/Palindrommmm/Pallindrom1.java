package Palindrommmm;

import java.util.Scanner;

public class Pallindrom1 {

	public static void main(String[] args) {
		String s = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to check");
		s=sc.nextLine();
		int i,j,flag=0;
		i =0;
		j = s.length()-1;
		flag=0;
		while(i<j&&flag==0) {
			if(s.charAt(i)!=s.charAt(j)) {
				flag=1;
				break;
			}
				i=i+1;
				j=j-1;

	}
			if (flag ==0)
				System.out.println("Palindrom");
			else
				System.out.println("not Palindrom");
			
			

}
		

}

