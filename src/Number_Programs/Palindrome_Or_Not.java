package Number_Programs;

public class Palindrome_Or_Not {
	public static boolean isPalindromeByString(int number) {
		String number1=""+number,
				   res="";
		int los=number1.length();
		for(int i=0;i<los;i++) {
			char ch=number1.charAt(i);
			res=ch+res;
		}
		if(number1.equals(res)) {
			return true;
		}
		return false;
	}
	public static boolean isPalindromeByInteger(int number) {
		int sum=0;
		int number2=number;
		while(number!=0) {
			int last=number%10;
			sum=sum*10+last;
			number=number/10;
		}
		if(number2==sum) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		for(int i=0;i<=10000;i++) {
			if(isPalindromeByInteger(i)) {
				if(isPalindromeByString(i)) {
					System.out.println(isPalindromeByInteger(i)+" "+i);
					System.out.println(isPalindromeByString(i)+" "+i);
				}
			}			
		}
		System.out.println(isPalindromeByString(121));
		System.out.println(isPalindromeByInteger(12112));
	}
}
