package Number_Programs;
public class Neon_Happy_Abundant {
	public static void main(String[] args) {
				isAbundantNumber(24);
				isNeon(9);
				
				isHappy(900);
	}
	public static void isAbundantNumber(int number) {
			int sum=0;
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				sum=sum+i;
			}
		}
		if(sum>number) {
			System.out.println(number+" is Abundant Number");
		}
	}
	public static void isNeon(int number) {
		int sum=0;
		int square=number*number;
		while(square!=0) {
			int last=square%10;
			sum=sum+last;
			square=square/10;
		}	
		if(sum==number) {
			System.out.println(number+" is Neon");
		}
	}
	public static void isHappy(int number) {
		int number1=number;
			while(number!=0) {
				int sum=0;
				int last=number%10,
					square=last*last;
				    while(square!=0) {
				    	int last1=square%10;
				    	sum=sum+last1;
				    	square=square/10;
				    }
				   if(sum>9) {
					   number=sum;
				   }
				   number=number/10;
				   if(sum==1) {
					   System.out.println(number1+" is Happy");
				   }
				   System.out.println("hii");
			}
		}
	}


