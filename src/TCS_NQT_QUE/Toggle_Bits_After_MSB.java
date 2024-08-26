package TCS_NQT_QUE;
public class Toggle_Bits_After_MSB {
	public static char [] toggleBits(char [] array) {
          int loa=array.length;
          for(int i=0;i<loa;i++) {
        	  if(array[i]=='1') { array[i]='0';}
        	  else { array[i]='1';}
          }	
          return array;       
          // or by simply in built methods like 
          // toggleBitsAfterMSB
          // toggleAllBits
	}
	public static void main(String[] args) {
		int num1=11;
		String num1BinaryString=Integer.toBinaryString(num1);
		char [] arrayBinary=num1BinaryString.toCharArray();
		char [] toggledArrayBinary=toggleBits(arrayBinary);
		String toggledString="";
		for(char ch:toggledArrayBinary) {
			toggledString=toggledString+ch;
		}
		System.out.println(toggledString);
	}
}
