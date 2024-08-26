package Number_Programs;

public class Print_Fibonacci_Upto_NthTerm {
	
	public static void FibonacciNumbersAndSum(int nNumbers) {
		int num1=0;
		int num2=1;
		int sum=0;
		for(int i=0;i<=nNumbers;i++) {
		System.out.print(i+")"+num1+" upto "+num2);
			sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.println(" fibonacci is "+sum);
		}
	}
	public static void main(String[] args) {
		FibonacciNumbersAndSum(10);
	}
}
