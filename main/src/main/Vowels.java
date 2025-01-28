package main;

public class Vowels {

	public static void main(String[] args) {
		String str="hello";
		int count=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length()-1-i;i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
		}
		count++;
		

	}
System.out.println("no.of vowels in given str:"+count);
}
}
