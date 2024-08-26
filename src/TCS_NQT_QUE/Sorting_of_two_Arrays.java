package TCS_NQT_QUE;
public class Sorting_of_two_Arrays {
	public static int[] mergeArrays(int [] array1,int [] array2) {
		int loa1=array1.length;
		int loa2=array2.length;
		array1=sortArray(array1);
		array2=sortArray(array2);		
		int [] mergedArray=new int[loa1+loa2];
		int i=0,j=0,k=0;
		while(i<loa1&&j<loa2) {
			if(array1[i]<=array2[j]) {
				mergedArray[k++]=array1[i++];
			}else {
				mergedArray[k++]=array2[j++];
			}
		}
		while(i<loa1) {
			mergedArray[k++]=array1[i++];
		}
		while(j<loa2) {
			mergedArray[k++]=array2[j++];
		}
		 return mergedArray;
	}
	public static int[] sortArray(int [] array) {
		int loa=array.length;
		for(int j=0;j<=loa;j++) {
			for(int i=0;i<loa-1;i++) {
				if(array[i]>array[i+1]) {
					int temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
				}
			}
		} 
		return array;
	}
	public static void main(String[] args) {
        	int[] num1= {11,1,10,9};	
        	int[] num2= {15,1,9,10,2};
        	int[] mergedArray=mergeArrays(num1, num2);
        	for(int i:mergedArray) {
        		System.out.print(i+",");
        	}
	}
}
