package Practise_21_AUG;
import java.util.HashSet;
public class Lnegth_Of_Longest_SubString_WithoutRepeating_Values {
	public static int length(String str) {
		int los=str.length(),
			left=0,
			right=0,
			maxlength=0;
		HashSet<Character> hashSet=new HashSet<>();
		while(right<los) {
			if(!hashSet.contains(str.charAt(right))) {
				hashSet.add(str.charAt(right));
				right++;
				maxlength=Math.max(maxlength,right-left);
			}else {
				hashSet.remove(str.charAt(left));
				left++;
			}			
		} return maxlength;
	}
	public static void main(String[] args) {
		String s1 = "123abcABC";
        System.out.println("Length of longest substring: " +length(s1));      
        String s2 = "abcabcabc";
        System.out.println("Length of longest substring: " + length(s2)); 
	}
}
