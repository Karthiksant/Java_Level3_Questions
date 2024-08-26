package String_Programs;
public class Anagram {
	public static String sortCharacter(String name) {
		char charArray []=name.toCharArray();
		int loa=charArray.length;
		for(int j=0;j<=loa;j++) {
			for(int i=0;i<loa-1;i++) {
				char ch1=charArray[i];
				char ch2=charArray[i+1];
				if(ch1>ch2) {
					char temp=ch1;
					charArray[i]=ch2;
					charArray[i+1]=temp;				
				}
			}
		}
		return new String(charArray);
	}
	public static void main(String[] args) {
		String name1="kar th ik";
		String name2="kihtrak";		
		name1=name1.replace(" ","").toLowerCase();
		name2=name2.replace(" ","").toLowerCase();
		
		if(name1.length()==name2.length()) {
			name1=sortCharacter(name1);
			name2=sortCharacter(name2);
			if(name1.equals(name2)) {
				System.out.println(" is anagram");
			}
		}
		else {
			System.out.println(" not anagram");
		}
	}
}
