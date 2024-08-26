package Number_Programs;
public class Perfect_Number_In_Given_Range {
	public static void isPerfectNumber(int number) {
		int sum=0;
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				sum=sum+i;
			}
		}
		if(sum==number) {
			System.out.println(number+" is perfect");
		}
	}
	public static void main(String[] args) {
		for(int i=0;i<=10000;i++) {
			isPerfectNumber(i);
		}
	}
}