package Number_Programs;

public class Factors_Factorial_Power {
	public static void main(String[] args) {
		System.out.println(powerOf(3,3));
		System.out.println(factorialOf(5));
		int [] array=factorsOf(12);
		for(int i:array) {
			System.out.print(i+" ,");
		}
	}	
	public static int powerOf(int number, int powerOf) {
		int prod=1;
		for(int i=1;i<=powerOf;i++) {
			prod=prod*number;
		}
		return prod;
	}
	public static int factorialOf(int number) {
		int fact=1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static int [] factorsOf(int number) {
		int count=0;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				count++;
			}
		}
		int [] array=new int[count];
		int k=0;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				array[k++]=i;
			}
		}
		return array;
	}
}
