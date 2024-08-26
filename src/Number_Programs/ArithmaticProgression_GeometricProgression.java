package Number_Programs;

public class ArithmaticProgression_GeometricProgression {
	
	public static void ArithmeticProgressionOf(int startingNumber,int differnceNumber,int nNumbers) {
		// an=a+(n-1)*d
		int APOf=startingNumber+(nNumbers-1)*differnceNumber;
		System.out.println(APOf);
	}
	public static void GeometricProgressionOf(int startingNumber,int commonRatio,int nNumbers) {
		// ar=a*(r)powerOf(n-1)
		int power=nNumbers-1;
		int prod=1;
		for(int i=1;i<=power;i++) {
		   	prod=prod*commonRatio;
		}	
		int GPOf=startingNumber*prod;
		System.out.println(GPOf);
	}
	public static void main(String[] args) {
					ArithmeticProgressionOf(1,2,5);
					GeometricProgressionOf(1,2,5);
	}
}
