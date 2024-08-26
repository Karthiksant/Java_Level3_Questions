package TCS_NQT_QUE;
public class sorting_zeros_to_end_bubbbleSort {
	public static int [] sortArray(int [] arrayNumbers) {
		int loa=arrayNumbers.length;
		for (int j=0; j<=loa; j++) {
			for(int i=0;i<loa-1;i++) {
				if(arrayNumbers[i]<arrayNumbers[i+1]) {
					int duplicate=arrayNumbers[i];
					arrayNumbers[i]=arrayNumbers[i+1];
					arrayNumbers[i+1]=duplicate;
				}
			}
		} return arrayNumbers;
	}
	public static void main(String [] args) {
		
		int [] arrayNumbers= {3,6,1,0,9,11,2,0,4,0};
		
		for (int i :sortArray(arrayNumbers)) {
			System.out.print(i+" ");
		}		
	}
}
