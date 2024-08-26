package Arrays;

public class Block_Swap_Algorithm{
	
	public static int [] blockSwapAlgorithm(int [] nums,int k) {
		int loa=nums.length;
		
		int arrayMain []=new int[loa];
		int arrayBlock1 []=new int[k];
		int arrayBlock2 []=new int[loa-k];
		int m=0,n=0,o=0;
		for(int i=0;i<k;i++) {
			arrayBlock1[m++]=nums[i];
		}
		for(int i=k;i<loa;i++) {
			arrayBlock2[n++]=nums[i];
		}
		for(int j=0;j<arrayBlock2.length;j++) {
	   		arrayMain[o++]=arrayBlock2[j];
	   	}
	   	for(int l=0;l<arrayBlock1.length;l++) {
	   		arrayMain[o++]=arrayBlock1[l];
	   	}
	   	return arrayMain;
	}
	public static int [] blockSwapAlgorithm2(int [] nums,int k) {
		int loa=nums.length;
		
		int arrayMain []=new int[loa];
		int arrayBlock1 []=new int[k];
		int arrayBlock2 []=new int[loa-k];
		int m=0,n=0,o=0;
		for(int i=0;i<k;i++) {
			arrayBlock1[m++]=nums[i];
		}
		for(int i=k;i<loa;i++) {
			arrayBlock2[n++]=nums[i];
		}
		for(int j=0;j<arrayBlock2.length;j++) {
			arrayMain[o++]=arrayBlock2[j];
		}
		for(int l=0;l<arrayBlock1.length;l++) {
			arrayMain[o++]=arrayBlock1[l];
		}
		return arrayMain;
	}
	public static void main(String[] args) {
			int nums[]= {1,2,3,4,5,6,7};
			int k=4;
			for(int i:blockSwapAlgorithm(nums, k)) {
				System.out.print(i+" ");
			}
	}
}
