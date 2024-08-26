package LCS_int_string_all;

public class LongestCommonSubsequence_intreturn {
	int LCS(String s1,String s2,int l1,int l2) {
		if(l1==0||l2==0) 
		   return 0;
			if(s1.charAt(l1-1)==s2.charAt(l2-1)) 
				return 1+LCS(s1, s2, l1-1, l2-1);
			else
				return Math.max(LCS(s1, s2, l1, l2-1),LCS(s1, s2, l1-1, l2));			
		}
	public static void main(String[] args) {
			String s1="abcccde";
			String s2="fgcccih";
			int l1=s1.length();
			int l2=s2.length();
			LongestCommonSubsequence_intreturn lcsObject=new LongestCommonSubsequence_intreturn();
		System.out.println(lcsObject.LCS(s1, s2, l1, l2));	
	}
}
