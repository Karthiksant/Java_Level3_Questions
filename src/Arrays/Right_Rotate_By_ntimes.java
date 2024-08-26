package Arrays;

public class Right_Rotate_By_ntimes {
	public static int[] rotateRight(int [] nums,int k) {
		int loa=nums.length;
	for(int j=1;j<=k;j++) {
		int temp=nums[loa-1];
			for(int i=loa-1;i>0;i--) {
				nums[i]=nums[i-1];
			}
			nums[0]=temp;
	}
		return nums;
	}
	
	public static void main(String[] args) {
			int nums []= {1,2,3,4,5};
			int [] resArray=rotateRight(nums,3);
			for(int i:resArray) {
				System.out.print(i+" ");
			}
	}
}
