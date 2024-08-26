package Number_Programs;

public class Armstrong_Numbers_In_Given_Range {
	public static void isArmstrong(int number) {
		int number1=number,
			number2=number,
			count=0;
		while(number1!=0) {
			number1=number1/10;
			count++;
		}
		int power=count,
				sum=0;
		while(number2!=0) {
			int last=number2%10,
				product=1;
			for(int i=1;i<=power;i++) {
				product=last*product;
			}	
			sum=sum+product;
			number2=number2/10;
		}
		if(sum==number) {
			System.out.println(number+" is Armstrong");
		}
	}
	public static void main(String[] args) {
		for(int i=0;i<=100000;i++) {
			isArmstrong(i);
		}
	}
}
