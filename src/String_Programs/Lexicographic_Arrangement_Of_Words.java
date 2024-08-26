package String_Programs;

import java.util.Arrays;

public class Lexicographic_Arrangement_Of_Words {
	public static void main(String[] args) {
		String name="hello this is karthik";
		
		String words []=name.split(" ");
		Arrays.sort(words);
		
       String result=String.join(" ",words);
       
       System.out.println(result);
	}
}
