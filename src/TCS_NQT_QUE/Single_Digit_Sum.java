package TCS_NQT_QUE;

public class Single_Digit_Sum {
	
	public static int sumOfDigits(int num) {
		int sum=0;
		while(num>9&&num!=0) {
			  sum=0;
				while(num!=0) {
					int last=num%10;
					sum+=last;
					num=num/10;
				}
				if(num<10) {num=sum; }		
			 } return sum;
	     }
	public static void main(String[] args) {
		int result=sumOfDigits(892);
		System.out.println(result);
	}
}
