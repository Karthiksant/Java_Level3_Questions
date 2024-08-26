package TCS_NQT_QUE;

import java.util.TreeSet;

public class Missing_numbers_by_looping {
	
	public static void main(String[] args) {
		int [] arrayNumbers= {1,2,3,4,7,10};
		int maxNumber=arrayNumbers[0];
		// =1 ; if given case to be started with one
		int minNumber=arrayNumbers[0];
		int loa=arrayNumbers.length;
		for(int i=0;i<loa;i++) {
			if(maxNumber<arrayNumbers[i]) {
				maxNumber=arrayNumbers[i];
			}
			if(minNumber>arrayNumbers[i]) {
				minNumber=arrayNumbers[i];
			}
		} System.out.println(minNumber+" "+maxNumber);
		TreeSet<Integer> missingNumbers=new TreeSet<>(); 	
		   for(int i=minNumber;i<=maxNumber;i++) {
			   boolean b=false;
			   for(int j=0;j<loa;j++) {
				int number=arrayNumbers[j];
				if(i==number) {
					b=false;
					break;
				}else { b=true;}
			}
		   if(b) { missingNumbers.add(i); }
		}
		   for ( Integer i: missingNumbers) {
			System.out.print(i+" , ");
		}
	}

}
