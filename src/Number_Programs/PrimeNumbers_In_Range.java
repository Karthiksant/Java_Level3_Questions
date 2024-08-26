package Number_Programs;

public class PrimeNumbers_In_Range {
	public static void isPrime(int number) {
		int count=0;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
			    count++;	
			}
		}
		if(count==2) {
			System.out.println(number+" = isPrime");
		}
	}
	public static void isPrimeWithoutLooping(int num) {
		if(num!=2&&num!=3&&num!=5&&num!=7) {
			if(num%2==0||num%3==0||num%5==0||num%5==0||num==0||num==1) {
				System.out.println(num+" is not prime");
			}else {
				System.out.println(num+" is prime");
			}
		}else {
			System.out.println(num+" is prime");
		}
	}	
	public static void main(String[] args) {
		for(int i=1;i<=50;i++) {
			isPrime(i);
			isPrimeWithoutLooping(i);
		}
	}
}
