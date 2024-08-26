package String_Programs;
public class uniqueLettersNonRepeated {	
	public static String removeDuplicate(String name) {
		int los=name.length();
		String result="";
		for(int i=0;i<los;i++) {
			char ch=name.charAt(i);
			if(!(result.contains(ch+""))) {
				result=result+ch;
			}
		}
		return result;
	}
	public static String uniqueNonRepeatingLetter(String name) {
		int los1=name.length();
		String result="";
		for(int i=0;i<los1;i++) {
			char ch1=name.charAt(i);
			int count=0;
			for(int j=0;j<los1;j++) {
				char ch2=name.charAt(j);
				if(ch1==ch2) {
					count++;
				}
			}
			if(count==1) {
				result=result+ch1;
			}
		}
		return result;
	}	
	public static void main(String[] args) {
		System.out.println(removeDuplicate("bdabdx"));
		System.out.println(uniqueNonRepeatingLetter("abcdeae"));
	}

}
