package String_Programs;
public class Sort_Characters_In_String {	
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
		 System.out.println(sortCharacter("asdfzxcv"));
	}
}
