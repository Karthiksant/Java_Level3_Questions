package Practise_21_AUG;

public class Moving_All_Zeros_To_End_With_Relative_Order {	
	public static  int [] moveToend(int [] nums) {
		int loa=nums.length;
		for(int k=0;k<loa;k++) {
			for(int i=0;i<loa-1;i++) {
				if(nums[i]==0){
					int temp=nums[i];
					nums[i]=nums[i+1];
					nums[i+1]=temp;
				}
			}
		} return nums;
	}
	public static void main(String[] args) {
			int [] nums= {1,0,0,0,4,0};
			int [] nums2=moveToend(nums);
			for(int i:nums2) {
				System.out.print(i+" ");
			}
	}
}
