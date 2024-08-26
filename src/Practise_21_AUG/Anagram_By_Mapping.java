package Practise_21_AUG;
import java.util.Arrays;
public class Anagram_By_Mapping {
	public static boolean isAnagram(String s1,String s2) {
		int los1=s1.length();
		int los2=s2.length();
		if(los1==los2) {
		   	char array1[]=s1.toCharArray();
		   	char array2[]=s2.toCharArray();
		   	Arrays.sort(array1);
		   	Arrays.sort(array2);
		   	if (Arrays.equals(array1,array2)) {
		   		return true;
			} else {
				return false;
			}		   	
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		String str1="abdabef";
		String str2="abdabef";
		System.out.println(isAnagram(str1, str2));
	}
}
