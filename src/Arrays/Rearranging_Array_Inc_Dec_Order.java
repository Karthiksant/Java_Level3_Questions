package Arrays;
public class Rearranging_Array_Inc_Dec_Order {
	public static int [] sortAscending(int [] nums) {
		int loa=nums.length;
		for(int k=1;k<=loa;k++) {
			for(int i=0;i<loa-1;i++) {
				if(nums[i]>nums[i+1]) {
					int temp=nums[i];
					nums[i]=nums[i+1];
					nums[i+1]=temp;				
				}
			}
		}
		return nums;
	}
	public static int [] sortDescending(int [] nums) {
		int loa=nums.length;
		for(int k=1;k<=loa;k++) {
			for(int i=0;i<loa-1;i++) {
				if(nums[i]<nums[i+1]) {
					int temp=nums[i];
					nums[i]=nums[i+1];
					nums[i+1]=temp;				
				}
			}
		}
		return nums;
	}
	public static void Display(int [] num) {
		for(int i:num) {
			System.out.print(" "+i);
		}
		System.out.println();
	}	
	public static void main(String[] args) {
		int [] nums= {6,7,3,1,2,12,4};
		//Display(sortAscending(nums));
		Display(sortDescending(nums));
	}
}
