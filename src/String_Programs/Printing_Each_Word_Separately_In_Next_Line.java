package String_Programs;

public class Printing_Each_Word_Separately_In_Next_Line {
	public static String[] printEachWord(String paragraph) {
		String [] words=paragraph.split(" ");
		return words;
	}
	public static void main(String[] args) {
		for(String i: printEachWord("  hello how are you ")){
			System.out.println(i);
		}
	}
}
