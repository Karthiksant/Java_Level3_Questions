package Number_Programs;

public class Number_ExpressingAs_Sum_Of_Two_Numbers_Is_Prime {

	public static void main(String[] args) {
		int number=18;
		for(int i=1;i<=number/2;i++) {
			if(isPrime(i)&&isPrime(number-i)) {
				System.out.println(number+" is the sum of two prime numbers "+i+" + "+(number-i));
			}
		}
	}
	public static boolean isPrime(int number) {
		if(number<2) {
			return false;
		}
		int count=0;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}else {
			return false;
		}
	}
}
