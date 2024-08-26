package TCS_NQT_QUE;

import java.util.Arrays;

public class Anagram_Strings {
	
	public static boolean isAnagram(String str1,String str2) {
		
		str1=str1.replace(" ", "").toLowerCase();
		str2=str2.replace(" ", "").toLowerCase();
		
		char [] charArray1=str1.toCharArray();
		char [] charArray2=str2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		if(Arrays.equals(charArray1,charArray2)) {
			return true;
		}else { return false; }
	}

	public static void main(String[] args) {
	
		String str1="karthi Sant";
		String str2="kasant rTHI";
		
		boolean result=isAnagram(str1, str2);
		
		System.out.println(str1+" "+str2+" isAnagram="+result);

	}

}
