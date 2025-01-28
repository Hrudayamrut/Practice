package strings;

public class ReverseString {

	public static void main(String[] args) {
		

			
				// 1-take a string
				StringBuilder sb = new StringBuilder("Hello");
				//loop for repeat the work
				for(int i=0;i<sb. length()/2;i++) {
					//calculate the index which are replacing
					int front = i;
					int back = sb.length()-1-i; // 5-1-0=4 h is replaced in 4th index i.e.o is replced by h 
					//find out which char is in front and which char is in back
					char frontChar = sb.charAt(front);
					char backChar = sb.charAt(back);
					//replace front char to back char and back char to front char
					sb.setCharAt(front,backChar);
					sb.setCharAt(back, frontChar);
					
				

			}
				//print outside the loop
				System.out.println(sb);

			}
		


	}


