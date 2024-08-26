package TCS_NQT_QUE;
public class Odd_Numbered_Vechiles_fine{	
	public static int countOddNoVechiles(int [] arrayNumbers) {
		int loa=arrayNumbers.length;
		int count=0;
		for(int i=0;i<loa;i++) {
			if(!(arrayNumbers[i]%2==0)) {
				count++;
			}
		} return count;
	}
	public static void main(String[] args) {	
		int [] vechileNumbers= {3,4,5,6,7,8};
		// 200rs fine per vechile
		int fine=200*countOddNoVechiles(vechileNumbers);
		System.out.println("Total fine ="+fine);
	}
}
