package BitwiseOperators;

public class shift_left_right {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		String aBinary=Integer.toBinaryString(a);
		String bBinary=Integer.toBinaryString(b);
		
		int aBinaryvalues=Integer.parseInt(aBinary);
		int bBinaryvalues=Integer.parseInt(bBinary);
		
		System.out.println(aBinaryvalues);
		System.out.println(bBinaryvalues);
		
		int leftShift=a<<2;
		String shiftString=Integer.toBinaryString(leftShift);
			
		System.out.println(leftShift);
		System.out.println(shiftString);
		
		int rightShift=a>>2;
		String shiftString1=Integer.toBinaryString(rightShift);
		
		System.out.println(rightShift);
		System.out.println(shiftString1);
	}
}
