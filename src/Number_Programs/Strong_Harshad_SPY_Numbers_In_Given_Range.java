package Number_Programs;

public class Strong_Harshad_SPY_Numbers_In_Given_Range {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
		//	isStrong(i);
		}
		for(int i=1;i<=50;i++) {
			isHarshad(i);
			isSPY(i);
		}
	}
	public static void isStrong(int number) {
		int number2=number,
				sum=0;		
		while(number2!=0) {
			int last=number2%10;
			int fact=1;
			for(int i=1;i<=last;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			number2=number2/10;
		}
		if(sum==number) {
			System.out.println(number+" is Strong Number");
		}
	}
	public static void isHarshad(int number) {
			int number1=number,
				sum=0;
			while(number!=0) {
				int last=number%10;
				sum=sum+last;
				number=number/10;
			}
			if(number1%sum==0) {
				System.out.println(number1+" is Harshad");
			}
	}
	public static void isSPY(int number) {
		   int number1=number,
				 sum=0,
				prod=1;
		while(number!=0) {
			int last=number%10;
			sum=sum+last;
			prod=prod*last;
			number=number/10;
		}
		if(sum==prod) {
			System.out.println(number1+" is SPY");
		}
	}
}
