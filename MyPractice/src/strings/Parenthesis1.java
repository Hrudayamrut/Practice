package strings;


	

	import java.util.Stack;

	public class Parenthesis1 {
		
		//write gelval
		public char getVal(char ch)
		//give corresponding opening bracket
		
		{
			switch(ch)
			{
			case ']' :return '[';
			case '}' :return '{';
			case ')' :return '(';
			default:return ' ';
			}
		}

			public boolean isValid(String s) {
			
	//make two strings
			String opening="({[";
			String closing=")}]";
			//stror the char
			Stack<Character> st=new Stack<>();
			
			//loop and read the char
			//will read string s chara and convert in array char
			for(char ch:s.toCharArray())
			{
			if(opening.indexOf(ch)!=-1)
				//push opening bracket in stack
				st.push(ch);
			else
			{
				if(st.size()==0) return false;
				//pop operation
				char tmp=st.pop();
				//by giving closing bracket corresponding closing bracket will pass
		      if(getVal(ch)!=tmp)
			return false;
			}
			

	}
			
			return st.size()==0;
			}
	}
	



