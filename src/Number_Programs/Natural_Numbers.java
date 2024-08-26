package Number_Programs;

public class Natural_Numbers {
	public static void sumOfNatural(int nNumbers) {
		int sum=(nNumbers*(nNumbers+1))/2;
		System.out.println(sum);
	}
	public static void sumOfSquareNatural(int nNumbers) {
		int sum=((nNumbers*(nNumbers+1)*(2*nNumbers+1))/6);
		System.out.println(sum);
	}
	public static void sumOfCubeNatural(int nNumbers) {
		int sum=(nNumbers*(nNumbers+1)/2);
		     sum=sum*sum;
		 	System.out.println(sum);
	}

	public static void main(String[] args) {
		sumOfNatural(5);
		sumOfSquareNatural(3);
		sumOfCubeNatural(3);
	}

}
