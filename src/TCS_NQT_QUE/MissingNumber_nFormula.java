package TCS_NQT_QUE;
public class MissingNumber_nFormula {
	public static void main(String[] args) {
		int [] arrayNumbers= {1,2,3,4,5,7};		
		// n*(n+1)/2 formula
		int totalNumbers=arrayNumbers.length+1;
		int totalSum=(totalNumbers*(totalNumbers+1)/2);
		int arrayNumbersSum=0;
		for(int i:arrayNumbers){
			arrayNumbersSum +=i;
		}
		int missingNumber=totalSum-arrayNumbersSum;
		System.out.println(missingNumber);
	}
}
