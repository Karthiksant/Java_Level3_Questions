package Number_Programs;
public class QuadriaticEquation {
	public static void main(String[] args) {
			QuadriaticEquationOf(2, 4, -6);
	}
	public static void QuadriaticEquationOf(int a,int b,int c) {
		int result1=(int) Math.sqrt(b*b-(4*a*c));
		int result2=(-b+result1)/(2*a);
		int result3=(-b-result1)/(2*a);
		System.out.println("QuadriticEquation of "+a+" , "+b+" , "+c+" is = "+result2+" & "+result3);
	}
}
