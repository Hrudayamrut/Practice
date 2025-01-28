package Stringssss;

public class ReverseString {

	public static void main(String[] args) {
		//declare string
		StringBuilder sb = new StringBuilder("Vanita");
		
			for(int i=0;i<=sb.length()/2;i++) {
				int front = i;
				int back = sb.length() -1-i;
				char frontChar = sb.charAt(front);
				char backchar = sb.charAt(back);
				sb.setCharAt(front, backchar);
				sb.setCharAt(back, frontChar);
				
			}
			System.out.println(sb);
		}

	

}
