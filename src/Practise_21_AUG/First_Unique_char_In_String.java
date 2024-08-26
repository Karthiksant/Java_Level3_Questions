package Practise_21_AUG;
public class First_Unique_char_In_String {
	public static String uniqueCharIndex(String str) {
		int los=str.length();
		char ch='0';
		int index=-1;
		for(int i=0;i<los;i++) {
			char ch1=str.charAt(i);
			int count=0;
			for(int j=0;j<los;j++) {
				char ch2=str.charAt(j);
				if(ch1==ch2) {
					count++;
				}
			}
			if(count==1) {
				ch=ch1;
				index=i;
				break;
			}
		}  return " "+ch+" & "+index;
	}
	public static void main(String[] args) {
			String str="abcdefabcdefz";
			System.out.println(uniqueCharIndex(str));			
	}
}
