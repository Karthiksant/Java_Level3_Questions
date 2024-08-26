package Number_Programs;

public class LCM_HCF_GCD {
	public static int LCMof(int num1, int num2) {
		int LCM=(num1*num2)/GCDof(num1, num2);
		return LCM;
	}
	public static int GCDof(int num1, int num2) {
		int min=Math.min(num1, num2);
		int GCD=0;
		for(int i=1;i<=min;i++) {
			if(num1%i==0&&num2%i==0) {
				GCD=i;
			}
		}	
		return GCD;
	}
	public static void main(String[] args) {
			int num1=12;
			int num2=28;
			System.out.println(LCMof(num1, num2));
			System.out.println(GCDof(num1, num2));			
	}
}
