package LCS_int_string_all;

public class LongestCommonSubsequence_int_string_return {
	void LCS(String s1,String s2) {
		int l1=s1.length();
		int l2=s2.length();		
		int [][] DP=new int[l1+1][l2+1];	
		for (int i=0;i<l1;i++) {
			for (int j=0;j<l2;j++) {
				if(s1.charAt(i)==s2.charAt(j))
					DP[i+1][j+1]=1+DP[i][j];
				else
					DP[i+1][j+1]=Math.max(DP[i+1][j],DP[i][j+1]);
			}			
		}	
		StringBuilder result=new StringBuilder();
		int i=l1;
		int j=l2;
		
		while(i>0&&j>0) {
			if(s1.charAt(i-1)==s2.charAt(j-1)){
				result.append(s2.charAt(i-1));
				i--;
				j--;
			}
			else if(DP[i-1][j]>DP[i][j-1]) {
				i--;
			}
			else {
				j--;
			}
		}
		result.reverse();
		System.out.println("length ="+DP[l1][l2]);
		System.out.println(" LongSubSeq is "+result);
	}
	public static void main(String[] args) {
			String s1="abcccde";
			String s2="fgcccih";
			int l1=s1.length();
			int l2=s2.length();
			LongestCommonSubsequence_int_string_return lcsObject=new LongestCommonSubsequence_int_string_return();
		lcsObject.LCS(s1, s2);	
	}
}
